package com.rdeconti.mercadinho.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="PRODUCTS")
public class ProductModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer product_ID;
    private Integer product_storeID;
    private Integer product_productID;
    private Double product_amount;
    private LocalDate product_createdOn;
    private LocalDate product_changedOn;

    public ProductModel() {

    }

    public Integer getProduct_ID() {
        return product_ID;
    }

    public void setProduct_ID(Integer product_ID) {
        this.product_ID = product_ID;
    }

    public Integer getProduct_storeID() {
        return product_storeID;
    }

    public void setProduct_storeID(Integer product_storeID) {
        this.product_storeID = product_storeID;
    }

    public Integer getProduct_productID() {
        return product_productID;
    }

    public void setProduct_productID(Integer product_productID) {
        this.product_productID = product_productID;
    }

    public Double getProduct_amount() {
        return product_amount;
    }

    public void setProduct_amount(Double product_amount) {
        this.product_amount = product_amount;
    }

    public LocalDate getProduct_createdOn() {
        return product_createdOn;
    }

    public void setProduct_createdOn(LocalDate product_createdOn) {
        this.product_createdOn = product_createdOn;
    }

    public LocalDate getProduct_changedOn() {
        return product_changedOn;
    }

    public void setProduct_changedOn(LocalDate product_changedOn) {
        this.product_changedOn = product_changedOn;
    }
}
