package com.cognizant.springlearn.model;

public class Country {

    private String code;
    private String name;

    public Country() {
    }

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String countryCode) {
        this.code = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String countryName) {
        this.name = countryName;
    }

    @Override
    public String toString() {
        return "Country{"
                + "code='" + code + '\''
                + ", name='" + name + '\''
                + '}';
    }
}
