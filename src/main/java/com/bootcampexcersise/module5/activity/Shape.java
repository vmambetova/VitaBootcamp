package com.bootcampexcersise.module5.activity;

public abstract class Shape {
    public String color;
    private double area;
    private double perimeter;
    //empty constructor
    public Shape() {
    }

//getter and setter for area and perimeter
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
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
