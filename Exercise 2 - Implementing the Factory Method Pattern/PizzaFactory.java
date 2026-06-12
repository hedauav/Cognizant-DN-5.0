package com.Anish.Factory;

public class PizzaFactory {

    public static Pizza getPizza(String type) {

        if ("VEG".equalsIgnoreCase(type)) {
            return new VegPizza();
        }

        if ("CHEESE".equalsIgnoreCase(type)) {
            return new CheesePizza();
        }

        throw new IllegalArgumentException("Invalid Pizza Type");
    }
}