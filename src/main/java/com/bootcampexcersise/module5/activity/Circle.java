package com.bootcampexcersise.module5.activity;

public class Circle extends Shape{

    private double radius;
    private String color;
    private double area;
    private double perimeter;
    private static final double pi = 3.14;

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
