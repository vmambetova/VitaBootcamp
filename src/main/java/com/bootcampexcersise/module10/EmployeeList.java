package com.bootcampexcersise.module10;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public static void main(String[] args) {
        //creating objects
        Employee employee1 = new Employee("actor", "DaysOfOurLives", 123.4);
        Employee employee2 = new Employee("clown", "Circus", 23244.1);
        Employee employee3 = new Employee("teacher", "School", 144.1);
        Employee employee4 = new Employee("paleontologist", "Museum", 13764.1);
        Employee employee5 = new Employee("chef", "Restaurant", 9764.1);

        //setting names
        employee1.setName("Joey");
        employee2.setName("Chandler");
        employee3.setName("Phoebe");
        employee4.setName("Ross");
        employee5.setName("Monica");

        //created a list and added all objects to the list
        List<Employee> empList = new ArrayList<Employee>();
        empList.add(employee1);
        empList.add(employee2);
        empList.add(employee3);
        empList.add(employee4);
        empList.add(employee5);

        // return max salary
        Employee obj = new Employee();
        System.out.println("The Employee whose salary is the highest is : " + obj.getHighestPaidEmp(empList));
    }

}