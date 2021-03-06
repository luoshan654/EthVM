/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables;


import com.ethvm.db.Indexes;
import com.ethvm.db.Keys;
import com.ethvm.db.Public;
import com.ethvm.db.tables.records.AddressTokenCountRecord;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class AddressTokenCount extends TableImpl<AddressTokenCountRecord> {

    private static final long serialVersionUID = -1913179536;

    /**
     * The reference instance of <code>public.address_token_count</code>
     */
    public static final AddressTokenCount ADDRESS_TOKEN_COUNT = new AddressTokenCount();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AddressTokenCountRecord> getRecordType() {
        return AddressTokenCountRecord.class;
    }

    /**
     * The column <code>public.address_token_count.address</code>.
     */
    public final TableField<AddressTokenCountRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.CHAR(42).nullable(false), this, "");

    /**
     * The column <code>public.address_token_count.token_type</code>.
     */
    public final TableField<AddressTokenCountRecord, String> TOKEN_TYPE = createField("token_type", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>public.address_token_count.block_number</code>.
     */
    public final TableField<AddressTokenCountRecord, BigDecimal> BLOCK_NUMBER = createField("block_number", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>public.address_token_count.count</code>.
     */
    public final TableField<AddressTokenCountRecord, Long> COUNT = createField("count", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>public.address_token_count</code> table reference
     */
    public AddressTokenCount() {
        this(DSL.name("address_token_count"), null);
    }

    /**
     * Create an aliased <code>public.address_token_count</code> table reference
     */
    public AddressTokenCount(String alias) {
        this(DSL.name(alias), ADDRESS_TOKEN_COUNT);
    }

    /**
     * Create an aliased <code>public.address_token_count</code> table reference
     */
    public AddressTokenCount(Name alias) {
        this(alias, ADDRESS_TOKEN_COUNT);
    }

    private AddressTokenCount(Name alias, Table<AddressTokenCountRecord> aliased) {
        this(alias, aliased, null);
    }

    private AddressTokenCount(Name alias, Table<AddressTokenCountRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AddressTokenCount(Table<O> child, ForeignKey<O, AddressTokenCountRecord> key) {
        super(child, key, ADDRESS_TOKEN_COUNT);
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
        return Arrays.<Index>asList(Indexes.ADDRESS_TOKEN_COUNT_PKEY, Indexes.IDX_ADDRESS_TOKEN_COUNT_BY_TOKEN_TYPE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AddressTokenCountRecord> getPrimaryKey() {
        return Keys.ADDRESS_TOKEN_COUNT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AddressTokenCountRecord>> getKeys() {
        return Arrays.<UniqueKey<AddressTokenCountRecord>>asList(Keys.ADDRESS_TOKEN_COUNT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressTokenCount as(String alias) {
        return new AddressTokenCount(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AddressTokenCount as(Name alias) {
        return new AddressTokenCount(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AddressTokenCount rename(String name) {
        return new AddressTokenCount(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AddressTokenCount rename(Name name) {
        return new AddressTokenCount(name, null);
    }
}
