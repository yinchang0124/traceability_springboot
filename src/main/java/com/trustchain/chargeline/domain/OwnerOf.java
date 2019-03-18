package com.trustchain.chargeline.domain;

public class OwnerOf {
    private String token_id;

    public OwnerOf(String token_id) {
        this.token_id = token_id;
    }

    public String getToken_id() {
        return token_id;
    }

    public void setToken_id(String token_id) {
        this.token_id = token_id;
    }
}
