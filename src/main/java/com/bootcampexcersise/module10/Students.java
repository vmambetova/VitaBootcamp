package com.bootcampexcersise.module10;

public class Students extends Person {

    private String schoolName;

    //getter and setter
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    //method indroduce implemetation
    @Override
    void introduce() {
        System.out.println("I study in university " + getSchoolName());
    }
}