package com.itheima.pojo;

import java.io.Serializable;

public class Account implements Serializable {
    private String owner;
    private double money;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
