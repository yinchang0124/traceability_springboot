package com.trustchain.chargeline.domain;

public class Transfer {
    private String to;
    private String token_id;

    public Transfer(String to, String token_id) {
        this.to = to;
        this.token_id = token_id;
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
