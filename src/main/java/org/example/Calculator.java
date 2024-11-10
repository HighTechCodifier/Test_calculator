package org.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        
        //double result = 0;
        try {

            if (b == 0) {

                System.out.println("Insert only real numbers.");
                System.out.println("Division by zero is not allowed.");
                return Double.NaN; //Returns NaN to indicate an invalid result

            }

            return (double) a / (double) b;

        }

        catch (ArithmeticException e){

            //Print the error message
            System.out.println(e.getMessage());
            return Double.NaN; //Returns NaN to indicate an invalid result

        }

    }

    public double squareRootOf(int a) {

        if (a < 0) {
            System.out.println("ERROR:");
            System.out.println("Cannot calculate the square root of a negative number.");
            return Double.NaN; //Returns NaN to indicate an invalid result
        }
        else {
            return Math.sqrt(a);
        }

    }

    public double getArea(int a) {
        if (a < 0) {
            return Double.NaN;
        }
        double area = Math.PI * (a * a);
        return Math.round(area * 100.0) / 100.0;
    }

    public double getCircumference(int a) {
        if (a < 0) {
            return Double.NaN;
        }
        double circumference = Math.PI * 2 * a;
        return Math.round(circumference * 100.0) / 100.0;
    }

}
