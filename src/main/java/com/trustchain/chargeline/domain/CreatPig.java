package com.trustchain.chargeline.domain;

public class CreatPig {
    private String breed;
    private String weight;
    private String bigchainDB_id;

    public CreatPig(String breed, String weight, String bigchainDB_id) {
        this.breed = breed;
        this.weight = weight;
        this.bigchainDB_id = bigchainDB_id;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBigchainDB_id() {
        return bigchainDB_id;
    }

    public void setBigchainDB_id(String bigchainDB_id) {
        this.bigchainDB_id = bigchainDB_id;
    }
}
