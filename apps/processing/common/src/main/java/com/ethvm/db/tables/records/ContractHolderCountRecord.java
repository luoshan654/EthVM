/*
 * This file is generated by jOOQ.
 */
package com.ethvm.db.tables.records;


import com.ethvm.db.tables.ContractHolderCount;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ContractHolderCountRecord extends UpdatableRecordImpl<ContractHolderCountRecord> implements Record4<String, BigDecimal, String, Long> {

    private static final long serialVersionUID = 1881597046;

    /**
     * Setter for <code>public.contract_holder_count.contract_address</code>.
     */
    public ContractHolderCountRecord setContractAddress(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_holder_count.contract_address</code>.
     */
    public String getContractAddress() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.contract_holder_count.block_number</code>.
     */
    public ContractHolderCountRecord setBlockNumber(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_holder_count.block_number</code>.
     */
    public BigDecimal getBlockNumber() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>public.contract_holder_count.token_type</code>.
     */
    public ContractHolderCountRecord setTokenType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_holder_count.token_type</code>.
     */
    public String getTokenType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.contract_holder_count.count</code>.
     */
    public ContractHolderCountRecord setCount(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_holder_count.count</code>.
     */
    public Long getCount() {
        return (Long) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record3<String, BigDecimal, String> key() {
        return (Record3) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, BigDecimal, String, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<String, BigDecimal, String, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ContractHolderCount.CONTRACT_HOLDER_COUNT.CONTRACT_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return ContractHolderCount.CONTRACT_HOLDER_COUNT.BLOCK_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ContractHolderCount.CONTRACT_HOLDER_COUNT.TOKEN_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return ContractHolderCount.CONTRACT_HOLDER_COUNT.COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getContractAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getBlockNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTokenType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getContractAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getBlockNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTokenType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractHolderCountRecord value1(String value) {
        setContractAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractHolderCountRecord value2(BigDecimal value) {
        setBlockNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractHolderCountRecord value3(String value) {
        setTokenType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractHolderCountRecord value4(Long value) {
        setCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ContractHolderCountRecord values(String value1, BigDecimal value2, String value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContractHolderCountRecord
     */
    public ContractHolderCountRecord() {
        super(ContractHolderCount.CONTRACT_HOLDER_COUNT);
    }

    /**
     * Create a detached, initialised ContractHolderCountRecord
     */
    public ContractHolderCountRecord(String contractAddress, BigDecimal blockNumber, String tokenType, Long count) {
        super(ContractHolderCount.CONTRACT_HOLDER_COUNT);

        set(0, contractAddress);
        set(1, blockNumber);
        set(2, tokenType);
        set(3, count);
    }
}