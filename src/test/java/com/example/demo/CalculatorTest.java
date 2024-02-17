package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testSubtract() {
        float expected = 1.0f;

        assertEquals(expected, calculator.subtract(2.f, 1.f));
    }

    @Test
    void testDivide() {
        float expected = 4.0f;

        assertEquals(expected, calculator.divide(8.f, 2.f));
    }

    @Test
    void testMultiply() {
        float expected = 8.0f;

        assertEquals(expected, calculator.multiply(2.f, 4.f));
    }

    @Test
    void testAdd() {
        float expected = 3.0f;

        assertEquals(expected, calculator.add(2.f, 1.f));

    }
}
