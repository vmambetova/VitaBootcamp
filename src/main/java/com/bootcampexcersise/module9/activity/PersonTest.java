package com.bootcampexcersise.module9.activity;

import junit.framework.TestCase;

public class PersonTest extends TestCase {

    private Person person;

    //TODO: create set up
    protected void setUp() throws Exception {
        super.setUp();
        person = new Person();
    }

    //TODO: create teardown
    protected void tearDown() throws Exception {
        person = null;
        super.tearDown();
    }

    //TODO: create unit tests for getters and setters
    public void testSetAndGetWeight() {
        int testWeight1 = 105;
        person.setWeight(testWeight1);
        assertEquals(testWeight1, person.getWeight());
    }

    public void testSetAndGetHeight() {
        float testHeight1 = 1.5f;
        person.setHeight(testHeight1);
        assertEquals(testHeight1, person.getHeight());
        //TODO: create unit test for getBodyMassIndex method

    }

    public void testBmi1() {
        double bmi = person.bodyMassInd(0, 0);
        assertEquals(0.0, bmi);
    }

    public void testBmi2() {
        double bmi = person.bodyMassInd(100, 1.5f);
        double bmiExpected = 100 / Math.sqrt(1.5);
        assertEquals(bmiExpected,bmi);
    }
    public void testBmi3() {
        double bmi = person.bodyMassInd(100, -2.0f);
        double bmiExpected = 100 / Math.sqrt(-2.0);
        assertEquals(bmiExpected,bmi);
    }
    public void testBmi4() {
        double bmi = person.bodyMassInd(-100, 1.9f);
        double bmiExpected = -100 / Math.sqrt(1.9);
        assertEquals(bmiExpected,bmi);
    }
}


