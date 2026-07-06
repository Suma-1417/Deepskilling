package com.cognizant.ormlearn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Component
public class DataLoader implements CommandLineRunner {

    private final CountryRepository repository;

    public DataLoader(CountryRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        repository.save(new Country("IN", "India"));
        repository.save(new Country("US", "United States"));
        repository.save(new Country("JP", "Japan"));
        repository.save(new Country("AU", "Australia"));

        System.out.println("Sample Countries Inserted Successfully");
    }
}
