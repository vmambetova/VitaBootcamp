package com.bootcampexcersise.module5.activity;

//TODO: extend Employee_I to Person_I.
public class Employee_I extends Person_I {

    //Attributes
    private int salary;
    private String title;

//Behavior
//TODO: write default constructor. Print 'I'm an Employee_I Constructor'
public Employee_I() {
    System.out.println("I'm Student_I constructor");
}

//TODO: write getter for int salary
public int getSalary() {
    return salary;
}

//TODO: write setter for int salary
public void setSalary(int salary) {
    this.salary = salary;
}

//TODO: write getter for String title
public String getTitle() {
    return title;
}

//TODO: write setter for String title
public void setTitlel(String title) {
    this.title = title;
}
}
