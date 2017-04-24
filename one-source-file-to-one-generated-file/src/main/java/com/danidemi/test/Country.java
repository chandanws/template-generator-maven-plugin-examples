package com.danidemi.test;

public enum Country {

    ITALY("IT", "Ur"), FRANCE("FR", "Ar");

    private final String name;
    private final String continent;

    Country(String name, String continent){
        this.name = name;
        this.continent = continent;
    }

}