package com.bootcampexcersise.module5.activity;

public class Circle extends Shape{

    private double radius;
    private String color;
    private static final double pi = 3.14;
    public Circle(){
        System.out.println("I am a circle");
    }
    //getter and setter for radius
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return (pi*(radius*radius));
    }

    @Override
    public double calculatePerimeter() {
        return pi*radius;
    }

}
