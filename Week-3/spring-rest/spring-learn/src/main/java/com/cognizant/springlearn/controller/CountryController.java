package com.cognizant.springlearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    // Existing endpoint
    @GetMapping("/country")
    public Country fetchCountry() {
        return countryService.getCountry();
    }

    // New endpoint
    @GetMapping("/countries/{code}")
    public Country fetchCountryByCode(@PathVariable String code) {
        return countryService.getCountryByCode(code);
    }
}
