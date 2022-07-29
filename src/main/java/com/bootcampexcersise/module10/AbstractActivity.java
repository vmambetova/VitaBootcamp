package com.bootcampexcersise.module10;

public class AbstractActivity {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Clerk", "MSC", 1233.0);
        employee1.setName("Rachel");
        employee1.setAge(20);
        employee1.introduce();

        Employee employee2 = new Employee("CompanyLTD");
        employee2.setName("Monica");
        employee2.setAge(30);
        employee2.setJobTitle("Chef");
        employee2.setSalary(123443.0);
        employee2.introduce();

        Students student1 = new Students();
        student1.setSchoolName("RTU");
        /*student1.setName("Ross");
        student1.setAge(32);*/
        student1.introduce();


    }
}