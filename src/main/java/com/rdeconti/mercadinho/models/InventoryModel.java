package com.rdeconti.mercadinho.models;

import java.time.LocalDate;
import java.util.Date;

public class InventoryModel {

    private Integer inventory_ID;
    private Integer inventory_storeID;
    private Integer inventory_productID;
    private Double inventory_amount;
    private LocalDate inventory_createdOn;
    private LocalDate inventory_changedOn;

    public InventoryModel() {

    }

    public Integer getInventory_ID() {
        return inventory_ID;
    }

    public void setInventory_ID(Integer inventory_ID) {
        this.inventory_ID = inventory_ID;
    }

    public Integer getInventory_storeID() {
        return inventory_storeID;
    }

    public void setInventory_storeID(Integer inventory_storeID) {
        this.inventory_storeID = inventory_storeID;
    }

    public Integer getInventory_productID() {
        return inventory_productID;
    }

    public void setInventory_productID(Integer inventory_productID) {
        this.inventory_productID = inventory_productID;
    }

    public Double getInventory_amount() {
        return inventory_amount;
    }

    public void setInventory_amount(Double inventory_amount) {
        this.inventory_amount = inventory_amount;
    }

    public LocalDate getInventory_createdOn() {
        return inventory_createdOn;
    }

    public void setInventory_createdOn(LocalDate inventory_createdOn) {
        this.inventory_createdOn = inventory_createdOn;
    }

    public LocalDate getInventory_changedOn() {
        return inventory_changedOn;
    }

    public void setInventory_changedOn(LocalDate inventory_changedOn) {
        this.inventory_changedOn = inventory_changedOn;
    }
}