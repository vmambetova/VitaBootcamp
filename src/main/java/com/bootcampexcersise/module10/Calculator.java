package com.bootcampexcersise.module10;

public class Calculator extends Exception {

    //create 2 addition methods
    public int addition(int x, int y) {
        return x + y;
    }

    public int addition2(int x, int y, int z) {
        return x + y + z;
    }

    //create subtraction method
    public int subtract(int x, int y) {
        int diff = 0;
        if (x > y) {
            diff = x - y;
        } else {
            diff = y - x;
        }
        return diff;
    }

    //create division method with exception and try catch
    public int divide(int x, int y) {
        int result = 0;
        try {
            if (x == 0 || y == 0) {
                throw new ArithmeticException();
            } else {
                result = x / y;
            }
            System.out.println("The result is :" + result);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Input value must not be equal to 0");
        } finally {
            System.out.println("Thank you for using the calculator.");
        }
        return result;
    }


    //create multiplication method, throw Customexception
    public int multiply(int x, int y) throws CustomException {
        int result = 0;
        try {
            if (x == 0 || y == 0) {
                throw new CustomException();
            } else {
                result = x * y;
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Thank you for using the calculator.");
        }
        return result;
    }

}
