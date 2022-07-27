package com.bootcampexcersise.module5.activity;

public class AbstractActivity {
    public static void main(String args[]) {

        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Red");
        System.out.println(rectangle.getColor());
        rectangle.setSideA(13);
        rectangle.setSideB(25);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        // set and Print color of circle
        Circle circle = new Circle();
        circle.setColor("Blue");
        System.out.println(circle.getColor());
        circle.setRadius(12);
        System.out.println(circle.calculatePerimeter());
        System.out.println(circle.calculateArea());
        // Give area of circle
        // Print perimeter of circle
    }
}
