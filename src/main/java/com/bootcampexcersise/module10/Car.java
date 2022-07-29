package com.bootcampexcersise.module10;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("The car starts");
    }

    @Override
    public void stop() {
        System.out.println("The car stops");

    }
}
