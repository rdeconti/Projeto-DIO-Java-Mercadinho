package com.rdeconti.mercadinho.models;

import java.time.LocalDate;

public class StoreModel {

    private Integer store_ID;
    private Integer store_contactID;
    private Boolean store_status;
    private LocalDate store_createdOn;
    private LocalDate store_changedOn;

    public StoreModel() {

    }

    public Integer getStore_ID() {
        return store_ID;
    }

    public void setStore_ID(Integer store_ID) {
        this.store_ID = store_ID;
    }

    public Integer getStore_contactID() {
        return store_contactID;
    }

    public void setStore_contactID(Integer store_contactID) {
        this.store_contactID = store_contactID;
    }

    public Boolean getStore_status() {
        return store_status;
    }

    public void setStore_status(Boolean store_status) {
        this.store_status = store_status;
    }

    public LocalDate getStore_createdOn() {
        return store_createdOn;
    }

    public void setStore_createdOn(LocalDate store_createdOn) {
        this.store_createdOn = store_createdOn;
    }

    public LocalDate getStore_changedOn() {
        return store_changedOn;
    }

    public void setStore_changedOn(LocalDate store_changedOn) {
        this.store_changedOn = store_changedOn;
    }
}
