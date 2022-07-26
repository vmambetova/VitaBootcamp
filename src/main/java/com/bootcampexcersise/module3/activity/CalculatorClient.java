package com.bootcampexcersise.module3.activity;

public class CalculatorClient {
    /**
     * @param args
     */
    public static void main(String[] args) {

        /*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
         *final variable defined in Calculator class.
         */
        Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);

        System.out.println("*** Calculations will be performed using " + normalCalc.getCalculatorType() + " calculator ***");

        // Add
        int result = normalCalc.add(4, 5);
        System.out.println("1) Add result is " + result);
        
        // Multiply
        int[] mul = {2, 3, 4};
        int result1 = normalCalc.multiply(mul);

        System.out.println("2) Multiplication result is " + result1);


        //Division
        int result2 = normalCalc.divide(10, 2);
        System.out.println("3) Division result is " + result2);

        //Subtraction
        int result3 = normalCalc.subtract(10, 2);
        System.out.println("4) Division result is " + result3);

    }




    }

