package com.bootcampexcersise.module2.activity;

public class MultiplicationTable {

    public static void main(String[] args) {

        for (int i = 11; i <= 20; i++) {
            System.out.println("*** Table of "+i + " ***");

            for (int j = 11; j <= 20; j++) {
                System.out.println(i + "X" + j +" = " + i*j);
            }
    }
}

}
