package com.trustchain.chargeline.domain;


public class ConfirmBuy {

    private String token_id;
    private String value;

    public ConfirmBuy(String token_id, String value) {
        this.token_id = token_id;
        this.value = value;
    }

    public String getToken_id() {
        return token_id;
    }

    public void setToken_id(String token_id) {
        this.token_id = token_id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
