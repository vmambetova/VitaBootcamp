package com.bootcampexcersise.module5.activity;

public abstract class Shape {
    public String color;
    //empty constructor
    public Shape() {
    }

    //TODO:  Add abstract method calculateArea() and calculatePerimeter() with return type as double
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    //getter and setter for color
    public void setColor(String c) {
        color = c;
    }
    public String getColor() {
        return color;
    }
}
