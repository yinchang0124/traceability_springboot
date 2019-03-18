package com.trustchain.chargeline.domain;

public class TokensOfOwner {
    private String address;

    public TokensOfOwner(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
