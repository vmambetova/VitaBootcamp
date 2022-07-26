package com.bootcampexcersise.module2.activity;

public class Calculator {

    public static void main(String[] args) {
        int x = 12;
        int y = 3;
        int[] nums = {1, 2, 3, 4};
        System.out.println("Addition - " + add(x, y));
        System.out.println("Subtraction - " + subtract(x, y));
        System.out.println("Multiply - " + multiply(nums));
        System.out.println("Divide - " + divide(x, y));
    }

    private static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    private static int subtract(int x, int y) {
        int diff = x - y;
        return diff;
    }

    private static int multiply(int[] numbers) {
        int temp = 1;
        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;
    }

    private static int divide(int x, int y) {
        int divValue = 0;
        if (x == 0 && y == 0) {
            System.out.println("Dividing 0 with 0 is not possible");
        } else if (y == 0) {
            System.out.println("division by 0 is not possible");
        } else if (x == 0) {
            System.out.println("division by 0 is not possible");
        } else {
            return x / y;
        }

        return divValue;
    }

}
