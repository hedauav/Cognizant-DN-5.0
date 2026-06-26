package com.example.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator;

    // Runs before every test
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed");
    }

    // Test using AAA Pattern
    @Test
    public void testAddition() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    // Runs after every test
    @After
    public void tearDown() {
        System.out.println("Test completed");
    }
}