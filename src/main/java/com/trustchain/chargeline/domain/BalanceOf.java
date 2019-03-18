package com.trustchain.chargeline.domain;

public class BalanceOf {
    private String address;

    public BalanceOf(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
