package com.bootcampexcersise.module9.activity;

public class Person {
    private int weight;
    private float height;

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    //TODO: Create a method to calculate humans body mass index with two parameters for height and weight

    public double bodyMassInd(int weight, float height) {
        double bmi = 0;
        if(weight>0 && height>0 && weight<200 && height<2) {
            bmi = weight / Math.sqrt(height);
            System.out.println("Result " + bmi + " BMI");
        }else if(weight>200 && height>2){
            System.out.println("Result invalid");
        }
        return bmi;
    }
}