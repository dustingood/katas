package com.example.katas;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void add_WhenEmptyString_ShouldReturnZero(){
        int result = calculator.add("");

        assertEquals(0, result);
    }

    @Test
    public void add_WhenOneNumberPassed_ShouldReturnSameNumber(){
        int result = calculator.add("1");

        assertEquals(1, result);
    }

    @Test
    public void add_WhenTwoNumbersSeparatedByACommaPassed_ShouldReturnSumOfTwoNumbers(){
        int result = calculator.add("1,2");

        assertEquals(3, result);
    }

    @Test
    public void add_WhenThreeNumbersSeparatedByCommasPassed_ShouldReturnSumOfAllNumbers(){
        int result = calculator.add("1,2,3");

        assertEquals(6, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void add_WhenANegativeNumberIsPassed_ShouldThrowIllegalArgumentException(){
        calculator.add("1,2,-6");
    }

    @Test
    public void add_WhenNumberGreaterThan1000IsPassed_ShouldBeIgnored(){
        int result = calculator.add("1,2,3,4,10000");

        assertEquals(10, result);
    }
}