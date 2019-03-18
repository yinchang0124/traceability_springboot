package com.trustchain.chargeline.domain;

public class GetPig {
    private String token_id;


    public GetPig(String token_id) {
        this.token_id = token_id;
    }

    public String getToken_id() {
        return token_id;
    }

    public void setToken_id(String token_id) {
        this.token_id = token_id;
    }
}
