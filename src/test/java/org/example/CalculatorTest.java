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

    // 2.
    @Test
    @DisplayName("Verify subtract-method for integers")
    public void test_subtract_method() {

        //Choose two arbitrary integers:
        int a = 9;
        int b = 2;

        /*Define actual value by calling the subtract-method
        in the calculator-class on this calculator-object: */
        int actualValue = calculator.subtract(a, b);

        //Define the expected value
        int expectedValue = 7;

        assertEquals(expectedValue, actualValue, "\n2. test_subtract_method FAILED");
        System.out.println("2. test_subtract_method PASSED");

    }

    // 3.
    @Test
    @DisplayName("Verify multiply-method for integers")
    public void test_multiply_method() {

        //Choose two arbitrary integers:
        int a = 3;
        int b = 5;

        /*Define actual value by calling the multiply-method
        in the calculator-class on this calculator-object: */
        int actualValue = calculator.multiply(a, b);

        //Define the expected value
        int expectedValue = 15;

        /*Verify that the expected and the actual
        values are equal by an assert-statement:*/
        assertEquals(expectedValue, actualValue, "\n3. test_multiply_method FAILED");
        System.out.println("3. test_multiply_method PASSED");

    }

    // 4.
    @Test
    @DisplayName("Verify divide-method between integers")
    public void test_divide_method_betweenIntegers() {

        //Choose two arbitrary integers:
        int a = 9;
        int b = 2;

        /*Define actual value by calling the divide-method
        in the calculator-class on this calculator-object: */
        double actualValue = calculator.divide(a, b);

        //Define the expected value
        double expectedValue = (double) 9 / (double) 2;

        /*Verify the normal division by asserting whether the
        expected and the actual values are equal to each other or not:*/
        assertEquals(expectedValue , actualValue, "\n4. test_divide_method_betweenIntegers FAILED");
        System.out.println("4. test_divide_method_betweenIntegers PASSED");

    }

    // 5.
    @Test
    @DisplayName("Verify divide-method for division by 0")
    public void test_divide_method_forDivisionByZero() {

        //Choose two arbitrary integers:
        int a = 9;
        int b = 0;

       /*Define actual value by calling the divide-method
        in the calculator-class on this calculator-object: */
        double actualValue = calculator.divide(a, b);

        //Define the expected value:
        double expectedValue = Double.NaN;

        /*Verify the normal division by asserting whether the
        expected and the actual values are equal to each other or not:*/
        assertEquals(expectedValue , actualValue, "\n5. test_divide_method_forDivisionByZero FAILED");
        System.out.println("5. test_divide_method_forDivisionByZero PASSED");

    }

    // 6.
    @Test
    @DisplayName("Verify squareRootOf-method for a positive number")
    public void test_squareRootOf_method_forPositiveNumber(){

        //Choose a positive number:
        int positiveNumber = 9;

        /*Define actual value by calling the squareRootOf-method
        in the calculator-class on this calculator-object: */
        double actualValue = calculator.squareRootOf(positiveNumber);

        //Define the expected value
        double expectedValue = 3;

        /*Verify that the expected and the actual
        values are equal by an assert-statement:*/
        assertEquals(expectedValue , actualValue, "\n6. test_squareRootOf_method_forPositiveNumber FAILED");
        System.out.println("6. test_squareRootOf_method_forPositiveNumber PASSED");

    }

    // 7.
    @Test
    @DisplayName("Verify squareRootOf-method for a negative number")
    public void test_squareRootOf_method_forNegativeNumber(){

        //Choose a negative number:
        int negativeNumber = -9;

        /*Define actual value by calling the squareRootOf-method
        in the calculator-class on this calculator-object: */
        double actualValue = calculator.squareRootOf(negativeNumber);

        //Define the expected value
        double expectedValue = Double.NaN;

        /*Verify that the expected and the actual
        values are equal by an assert-statement:*/
        assertEquals(expectedValue , actualValue, "\n7. test_squareRootOf_method_forNegativeNumber FAILED");
        System.out.println("7. test_squareRootOf_method_forNegativeNumber PASSED");

    }

    // 8.
    @Test
    @DisplayName("Verify getArea-method for a positive number")
    public void test_getArea_method_forPositiveNumber(){

        //Choose a positive number:
        int positiveNumber = 3;

        /*Define actual value by calling the getArea-method
        in the calculator-class on this calculator-object: */
        double actualValue = calculator.getArea(positiveNumber);

        //Define the expected value
        double area = Math.PI * (positiveNumber * positiveNumber);
        double expectedValue = Math.round(area * 100.0) / 10.0;

        /*Verify that the expected and the actual
        values are equal by an assert-statement:*/
        assertEquals(expectedValue , actualValue, "\n8. test_getArea_method_forPositiveNumber FAILED");
        System.out.println("8. test_getArea_method_forPositiveNumber PASSED");

    }

    /*
    @Test
    public void forcedFailure_2() {
        fail("This test is supposed to fail to verify GitHub Actions detects failures.");
    }
    */


}

