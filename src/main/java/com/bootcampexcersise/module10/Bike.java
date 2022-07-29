package com.bootcampexcersise.module10;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("The bike starts");

    }

    @Override
    public void stop() {
        System.out.println("The bike stops");

    }
}
