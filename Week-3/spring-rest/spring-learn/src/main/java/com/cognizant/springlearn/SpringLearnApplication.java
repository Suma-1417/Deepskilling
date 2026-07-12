package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springlearn.model.Country;

@SpringBootApplication
public class SpringLearnApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringLearnApplication.class, args);

        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("countryBean", Country.class);

        System.out.println("Country Details");
        System.out.println("----------------");
        System.out.println("Code : " + country.getCode());
        System.out.println("Name : " + country.getName());

        context.close();
    }
}
