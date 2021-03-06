/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables.records;


import com.ethvm.db.tables.TokenMetadata;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.TableRecordImpl;


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
public class TokenMetadataRecord extends TableRecordImpl<TokenMetadataRecord> implements Record8<String, String, String, Integer, String, String, String, String> {

    private static final long serialVersionUID = 45269124;

    /**
     * Setter for <code>public.token_metadata.name</code>.
     */
    public TokenMetadataRecord setName(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.token_metadata.name</code>.
     */
    public String getName() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.token_metadata.symbol</code>.
     */
    public TokenMetadataRecord setSymbol(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.token_metadata.symbol</code>.
     */
    public String getSymbol() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.token_metadata.address</code>.
     */
    public TokenMetadataRecord setAddress(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.token_metadata.address</code>.
     */
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.token_metadata.decimals</code>.
     */
    public TokenMetadataRecord setDecimals(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.token_metadata.decimals</code>.
     */
    public Integer getDecimals() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.token_metadata.website</code>.
     */
    public TokenMetadataRecord setWebsite(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.token_metadata.website</code>.
     */
    public String getWebsite() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.token_metadata.logo</code>.
     */
    public TokenMetadataRecord setLogo(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.token_metadata.logo</code>.
     */
    public String getLogo() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.token_metadata.support</code>.
     */
    public TokenMetadataRecord setSupport(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.token_metadata.support</code>.
     */
    public String getSupport() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.token_metadata.type</code>.
     */
    public TokenMetadataRecord setType(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.token_metadata.type</code>.
     */
    public String getType() {
        return (String) get(7);
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, Integer, String, String, String, String> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row8<String, String, String, Integer, String, String, String, String> valuesRow() {
        return (Row8) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return TokenMetadata.TOKEN_METADATA.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TokenMetadata.TOKEN_METADATA.SYMBOL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TokenMetadata.TOKEN_METADATA.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TokenMetadata.TOKEN_METADATA.DECIMALS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TokenMetadata.TOKEN_METADATA.WEBSITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TokenMetadata.TOKEN_METADATA.LOGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TokenMetadata.TOKEN_METADATA.SUPPORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TokenMetadata.TOKEN_METADATA.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getSymbol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getDecimals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getWebsite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSupport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getSymbol();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getDecimals();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getWebsite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLogo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSupport();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenMetadataRecord value1(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenMetadataRecord value2(String value) {
        setSymbol(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenMetadataRecord value3(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenMetadataRecord value4(Integer value) {
        setDecimals(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenMetadataRecord value5(String value) {
        setWebsite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenMetadataRecord value6(String value) {
        setLogo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenMetadataRecord value7(String value) {
        setSupport(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenMetadataRecord value8(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TokenMetadataRecord values(String value1, String value2, String value3, Integer value4, String value5, String value6, String value7, String value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TokenMetadataRecord
     */
    public TokenMetadataRecord() {
        super(TokenMetadata.TOKEN_METADATA);
    }

    /**
     * Create a detached, initialised TokenMetadataRecord
     */
    public TokenMetadataRecord(String name, String symbol, String address, Integer decimals, String website, String logo, String support, String type) {
        super(TokenMetadata.TOKEN_METADATA);

        set(0, name);
        set(1, symbol);
        set(2, address);
        set(3, decimals);
        set(4, website);
        set(5, logo);
        set(6, support);
        set(7, type);
    }
}
