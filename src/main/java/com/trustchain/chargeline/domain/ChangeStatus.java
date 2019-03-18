package com.trustchain.chargeline.domain;

public class ChangeStatus {
    private String to;
    private String token_id;
    private String value;


    public ChangeStatus(String to, String token_id) {
        this.to = to;
        this.token_id = token_id;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getToken_id() {
        return token_id;
    }

    public void setToken_id(String token_id) {
        this.token_id = token_id;
    }
}
