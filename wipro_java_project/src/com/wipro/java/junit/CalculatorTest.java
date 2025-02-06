package com.wipro.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    
    private final Calculator calculator = new Calculator();
   @Test
    public void testAdd() {
        int result = calculator.add(3, 2);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.substract(5, 3);
        assertEquals(2, result);
    }

    
    public void testAddWithNegativeNumbers() {
        int result = calculator.add(-3, -2);
        assertEquals(-5, result);
    }

    
    public void testSubtractWithNegativeNumbers() {
        int result = calculator.substract(-3, -2);
        assertEquals(-1, result);
    }
}