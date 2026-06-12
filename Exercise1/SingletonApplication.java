package com.Anish.Singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingletonApplication {

    public static void main(String[] args) {

        Principal p1 = Principal.getInstance();
//      Principal p2 = Principal.getInstance();

        p1.announceHoliday();

//        System.out.println("P1 = " + p1);
//        System.out.println("P2 = " + p2);
//
//        System.out.println("Same Object ? " + (p1 == p2));

//        SpringApplication.run(SingletonApplication.class, args);
    }
}