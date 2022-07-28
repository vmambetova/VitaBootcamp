package com.bootcampexcersise.module7.activity;

public class ArithmeticExceptionActivity {

    public static void main(String[] args) {

        ArithmeticExceptionActivity arithmeticExceptionActivity = new ArithmeticExceptionActivity();
        arithmeticExceptionActivity.catchMe(10, 0);
        arithmeticExceptionActivity.catchMe(10, 2);
    }

    void catchMe(int num1, int num2) {
        try {
            int result = num1 / num2;
            System.out.println("The result is :" + result);
        }catch(ArithmeticException arithmeticException){
            System.out.println("Division by 0 is not possible");
        }finally{
            System.out.println("Thank you for using this program.");
        }


    }

}
