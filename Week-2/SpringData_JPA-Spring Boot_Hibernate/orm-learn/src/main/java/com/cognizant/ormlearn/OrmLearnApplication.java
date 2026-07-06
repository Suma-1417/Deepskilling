package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.ormlearn.service.CountryService;

@SpringBootApplication
public class OrmLearnApplication implements CommandLineRunner {

        private final CountryService countryService;

        public OrmLearnApplication(CountryService countryService) {
            this.countryService = countryService;
        }

        public static void main(String[] args) {
            SpringApplication.run(OrmLearnApplication.class, args);
        }

        @Override
        public void run(String... args) {

            System.out.println("Countries in Database:");
            countryService.getAllCountries().forEach(System.out::println);

            System.out.println("\nFinding Country with Code IN:");

            Country country = countryService.getCountry("IN");

            System.out.println(country);
        }

    }
    
