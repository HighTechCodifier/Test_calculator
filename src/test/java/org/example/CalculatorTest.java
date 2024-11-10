package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    //Create a calculator-object in Calculator-class:
    private static Calculator calculator;

    @BeforeAll
    static void createCalculatorObject() {
        calculator = new Calculator();
    }

    // 1.
    @Test
    @DisplayName("Verify add-method for integers")
    public void test_add_method() {

        //Choose two arbitrary integers:
        int a = 2;
        int b = 3;

        /*Define actual value by calling the add-method in
        the calculator-class on this calculator-object: */
        int actualValue = calculator.add(a, b);

        //Define the expected value
        int expectedValue = 5;

        /*Verify that the expected and the actual
        values are equal by an assert-statement:*/
        assertEquals(expectedValue, actualValue, "\n1. test_add_method FAILED");
        System.out.println("1. test_add_method PASSED");

    }

}

