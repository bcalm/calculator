package com.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void shouldAddTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void shouldSubTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.sub(5, 2));
    }

    @Test
    public void shouldMulTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.mul(1, 3));
    }

    @Test
    public void shouldDivTwoNumbers() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.div(9, 3));
    }
}
