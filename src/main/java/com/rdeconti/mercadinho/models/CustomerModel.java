package com.rdeconti.mercadinho.models;

import java.time.LocalDate;
import java.util.Date;

public class CustomerModel {

    private Integer customer_ID;
    private Integer customer_contactID;
    private Boolean customer_status;
    private LocalDate customer_createdOn;
    private LocalDate customer_changedOn;

    public CustomerModel() {

    }

    public Integer getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(Integer customer_ID) {
        this.customer_ID = customer_ID;
    }

    public Integer getCustomer_contactID() {
        return customer_contactID;
    }

    public void setCustomer_contactID(Integer customer_contactID) {
        this.customer_contactID = customer_contactID;
    }

    public Boolean getCustomer_status() {
        return customer_status;
    }

    public void setCustomer_status(Boolean customer_status) {
        this.customer_status = customer_status;
    }

    public LocalDate getCustomer_createdOn() {
        return customer_createdOn;
    }

    public void setCustomer_createdOn(LocalDate customer_createdOn) {
        this.customer_createdOn = customer_createdOn;
    }

    public LocalDate getCustomer_changedOn() {
        return customer_changedOn;
    }

    public void setCustomer_changedOn(LocalDate customer_changedOn) {
        this.customer_changedOn = customer_changedOn;
    }





}
