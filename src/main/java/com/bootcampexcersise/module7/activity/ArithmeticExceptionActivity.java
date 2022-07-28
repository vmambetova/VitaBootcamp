package com.bootcampexcersise.module7.activity;

public class ArithmeticExceptionActivity {

    public static void main(String[] args) {
      /*  int num1 = 10;
        int num2 = 0;
        int num3 = 2;*/
        ArithmeticExceptionActivity arithmeticExceptionActivity = new ArithmeticExceptionActivity();
        arithmeticExceptionActivity.catchMe(10, 0);
        arithmeticExceptionActivity.catchMe(10, 2);
        System.out.println(arithmeticExceptionActivity);
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
        int result = num1 / num2;
        System.out.println("The result is :" + result);


    }

}
