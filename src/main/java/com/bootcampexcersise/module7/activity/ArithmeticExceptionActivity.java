package com.bootcampexcersise.module7.activity;

public class ArithmeticExceptionActivity {
    //TODO: 1 - Type main method
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        int num3 = 2;
        ArithmeticExceptionActivity arithmeticExceptionActivity = new ArithmeticExceptionActivity();
        arithmeticExceptionActivity.catchMe(10, 0);
        arithmeticExceptionActivity.catchMe(10, 2);
        System.out.println(arithmeticExceptionActivity);
    }
    //TODO: 2  Create an instance of ArithmeticExceptionActivity and call catchMe with 10 and 0

    void catchMe(int num1, int num2) {
        //The following code results in an Exception.
        //TODO: 3 - Identify the exception and write code to handle this exception.
        int result = num1 / num2;
        System.out.println("The result is :" + result);

        //TODO: 4 - After handling the exception, write a finally block which
        //prints a message "Thank you for using this program."

        //TODO: 5- try to call catchMe with 10 and 2 now and see which messages get printed.

    }

}
