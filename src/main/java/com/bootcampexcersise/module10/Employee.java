package com.bootcampexcersise.module10;

public class Employee extends Person {

    private String jobTitle;
    private String company;
    private double salary;

    //constructors

    public Employee() {
    }
    public Employee(String jobTitle, String company, double salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }
    public Employee(String jobTitle, String company) {
        this.jobTitle = jobTitle;
        this.company = company;
    }
    public Employee(String company) {
        this.company = company;
    }
    // getters and setters
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //introduce method
    @Override
    public void introduce(){
        System.out.println("My name is: " + getName() + " and i am " + getAge() + " years old. " +
                "I work as " + getJobTitle() + " in " + getCompany() + " and my salary is " + getSalary());
    }
}
