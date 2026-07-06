package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountry(@NonNull String code) {
        return countryRepository.findById(code).orElse(null);
    }

    public Country addCountry(@NonNull Country country) {
        return countryRepository.save(country);
    }
}
