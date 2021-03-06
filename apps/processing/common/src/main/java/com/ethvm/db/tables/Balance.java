/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables;


import com.ethvm.db.Indexes;
import com.ethvm.db.Keys;
import com.ethvm.db.Public;
import com.ethvm.db.tables.records.BalanceRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.12"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Balance extends TableImpl<BalanceRecord> {

    private static final long serialVersionUID = -1793133774;

    /**
     * The reference instance of <code>public.balance</code>
     */
    public static final Balance BALANCE = new Balance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BalanceRecord> getRecordType() {
        return BalanceRecord.class;
    }

    /**
     * The column <code>public.balance.id</code>.
     */
    public final TableField<BalanceRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('balance_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.balance.address</code>.
     */
    public final TableField<BalanceRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.CHAR(42).nullable(false), this, "");

    /**
     * The column <code>public.balance.block_number</code>.
     */
    public final TableField<BalanceRecord, BigDecimal> BLOCK_NUMBER = createField("block_number", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.balance.block_hash</code>.
     */
    public final TableField<BalanceRecord, String> BLOCK_HASH = createField("block_hash", org.jooq.impl.SQLDataType.CHAR(66).nullable(false), this, "");

    /**
     * The column <code>public.balance.contract_address</code>.
     */
    public final TableField<BalanceRecord, String> CONTRACT_ADDRESS = createField("contract_address", org.jooq.impl.SQLDataType.CHAR(42), this, "");

    /**
     * The column <code>public.balance.token_type</code>.
     */
    public final TableField<BalanceRecord, String> TOKEN_TYPE = createField("token_type", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>public.balance.timestamp</code>.
     */
    public final TableField<BalanceRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>public.balance.balance</code>.
     */
    public final TableField<BalanceRecord, BigDecimal> BALANCE_ = createField("balance", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>public.balance.token_id</code>.
     */
    public final TableField<BalanceRecord, BigDecimal> TOKEN_ID = createField("token_id", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * Create a <code>public.balance</code> table reference
     */
    public Balance() {
        this(DSL.name("balance"), null);
    }

    /**
     * Create an aliased <code>public.balance</code> table reference
     */
    public Balance(String alias) {
        this(DSL.name(alias), BALANCE);
    }

    /**
     * Create an aliased <code>public.balance</code> table reference
     */
    public Balance(Name alias) {
        this(alias, BALANCE);
    }

    private Balance(Name alias, Table<BalanceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Balance(Name alias, Table<BalanceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Balance(Table<O> child, ForeignKey<O, BalanceRecord> key) {
        super(child, key, BALANCE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BALANCE_PKEY, Indexes.IDX_ALL_TOKEN_BALANCES_FOR_CONTRACT, Indexes.IDX_BALANCE_BY_TOKEN_TYPE_BLOCK_NUMBER, Indexes.IDX_BALANCES_BY_TOKEN_TYPE_BLOCK_NUMBER, Indexes.IDX_BALANCES_FOR_ADDRESS, Indexes.IDX_ETHER_BALANCE_FOR_ADDRESS, Indexes.IDX_TOKEN_BALANCES_FOR_CONTRACT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BalanceRecord, Long> getIdentity() {
        return Keys.IDENTITY_BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BalanceRecord> getPrimaryKey() {
        return Keys.BALANCE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BalanceRecord>> getKeys() {
        return Arrays.<UniqueKey<BalanceRecord>>asList(Keys.BALANCE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Balance as(String alias) {
        return new Balance(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Balance as(Name alias) {
        return new Balance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Balance rename(String name) {
        return new Balance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Balance rename(Name name) {
        return new Balance(name, null);
    }
}
