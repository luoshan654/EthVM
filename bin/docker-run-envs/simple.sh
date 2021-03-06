#!/usr/bin/env bash

BRANCH=$(git branch 2>/dev/null | grep '^*' | colrm 1 2 | tr / -)

section "Building utility docker images..."
${SCRIPT_DIR}/docker-build.sh build ethvm-utils
${SCRIPT_DIR}/docker-build.sh build migrator

section "Starting up containers..."
docker-compose up -d --build

# Give time to breathe
sleep 10

section "Checking current dataset..."
mkdir -p ${ROOT_DIR}/datasets

set +o errexit

DATASETS=("principal-${BRANCH}.sql.gz")

for DATASET in "${DATASETS[@]}"; do

  [[ -f ${ROOT_DIR}/datasets/${DATASET} ]] && (curl -o ${ROOT_DIR}/datasets/${DATASET}.md5 https://ethvm.s3.amazonaws.com/datasets/${DATASET}.md5 --silent 2>/dev/null && cd ${ROOT_DIR}/datasets/ && md5sum --check ${DATASET}.md5 &>/dev/null)
  [[ $? -ne 0 ]] && (info "Downloading dataset $DATASET..." && curl -o ${ROOT_DIR}/datasets/${DATASET} https://ethvm.s3.amazonaws.com/datasets/${DATASET} --progress-bar) || info "You're using latest dataset version! \n"

done

set -o errexit

section "Importing principal dataset..."

docker-compose exec timescale psql --quiet --username "${DATABASE_USER}" "${DATABASE_NAME}" -c "ALTER DATABASE ${DATABASE_NAME} SET timescaledb.restoring = 'on';"
gunzip <${ROOT_DIR}/datasets/${DATASETS[0]} | docker-compose exec -T timescale psql --quiet --username "${DATABASE_USER}" "${DATABASE_NAME}"
docker-compose exec timescale psql --quiet --username "${DATABASE_USER}" "${DATABASE_NAME}" -c "ALTER DATABASE ${DATABASE_NAME} SET timescaledb.restoring = 'off';"
