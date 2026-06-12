package com.Anish.Factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FactoryApplication {

    public static void main(String[] args) {

        Pizza pizza1 = PizzaFactory.getPizza("VEG");
        pizza1.prepare();

        Pizza pizza2 = PizzaFactory.getPizza("CHEESE");
        pizza2.prepare();

        SpringApplication.run(FactoryApplication.class, args);
    }
}