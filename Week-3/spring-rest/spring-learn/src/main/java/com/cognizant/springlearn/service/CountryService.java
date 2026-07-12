package com.cognizant.springlearn.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.cognizant.springlearn.model.Country;

@Service
public class CountryService {

    private final Map<String, Country> countries = new HashMap<>();

    public CountryService() {
        countries.put("IN", new Country("IN", "India"));
        countries.put("US", new Country("US", "United States"));
        countries.put("JP", new Country("JP", "Japan"));
        countries.put("AU", new Country("AU", "Australia"));
    }

   
    public Country getCountry() {
        return countries.get("IN");
    }

    public Country getCountryByCode(String code) {
        return countries.get(code.toUpperCase());
    }
}
