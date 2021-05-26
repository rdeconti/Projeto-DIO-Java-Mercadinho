package com.rdeconti.mercadinho.models;

import java.time.LocalDate;

public class UserModel {

    private Integer user_ID;
    private Integer user_contactID;
    private String user_password;
    private Boolean user_status;
    private LocalDate user_createdOn;
    private LocalDate user_changedOn;

    public UserModel() {

    }

    public Integer getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(Integer user_ID) {
        this.user_ID = user_ID;
    }

    public Integer getUser_contactID() {
        return user_contactID;
    }

    public void setUser_contactID(Integer user_contactID) {
        this.user_contactID = user_contactID;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Boolean getUser_status() {
        return user_status;
    }

    public void setUser_status(Boolean user_status) {
        this.user_status = user_status;
    }

    public LocalDate getUser_createdOn() {
        return user_createdOn;
    }

    public void setUser_createdOn(LocalDate user_createdOn) {
        this.user_createdOn = user_createdOn;
    }

    public LocalDate getUser_changedOn() {
        return user_changedOn;
    }

    public void setUser_changedOn(LocalDate user_changedOn) {
        this.user_changedOn = user_changedOn;
    }
}
