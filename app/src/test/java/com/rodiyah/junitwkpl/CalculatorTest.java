package com.rodiyah.junitwkpl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void  testAddSuccess(){
        int result = calculator.add(10, 10);
        assertEquals (20, result);
    }
}
