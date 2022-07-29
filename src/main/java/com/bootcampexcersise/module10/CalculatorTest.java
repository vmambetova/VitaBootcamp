package com.bootcampexcersise.module10;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
    private Calculator calculator;

    //setUp and tearDown
    protected void setUp() throws Exception {
        super.setUp();
        calculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        calculator = null;
        super.tearDown();
    }

    public void testAddition1() {
        int expectedValue = 3;
        int result = calculator.addition(1, 2);
        assertEquals(expectedValue, result);
    }

    public void testAddition2() {
        int expectedValue = 6;
        int result = calculator.addition2(1, 2, 3);
        assertEquals(expectedValue, result);
    }
    public void testAddition3() {
        int expectedValue = 4;
        int result = calculator.addition2(-1, 2, 3);
        assertEquals(expectedValue, result);
    }
    public void testAddition4() {
        int expectedValue = 0;
        int result = calculator.addition2(0, 0, 0);
        assertEquals(expectedValue, result);
    }
    public void testAddition5() {
        int expectedValue = 0;
        int result = calculator.addition(0, 0);
        assertEquals(expectedValue, result);
    }
    public void testAddition6() {
        int expectedValue = -200;
        int result = calculator.addition(-100, -100);
        assertEquals(expectedValue, result);
    }

    public void testSubstract1() {
        int expectedValue = 4;
        int result = calculator.subtract(8, 4);
        assertEquals(expectedValue, result);
    }

    public void testSubstract2() {
        int expectedValue = 8;
        int result = calculator.subtract(2, 10);
        assertEquals(expectedValue, result);
    }
    public void testSubstract3() {
        int expectedValue = -12;
        int result = calculator.subtract(-2, 10);
        assertEquals(expectedValue, result);
    }
    public void testSubstract4() {
        int expectedValue = 0;
        int result = calculator.subtract(-10, -10);
        assertEquals(expectedValue, result);
    }

    public void testDivide1() {
        int expectedValue = 3;
        int result = calculator.divide(9, 3);
        assertEquals(expectedValue, result);
    }
    public void testDivide2() {
        int expectedValue = 5;
        int result = calculator.divide(10, 0);
        assertEquals(expectedValue, result);
    }

    public void testDivide3() {
        int expectedValue = 5;
        int result = calculator.divide(0, 10);
        assertEquals(expectedValue, result);
    }

    public void testMultiply1() throws CustomException {
        int expectedValue = 30;
        int result = calculator.multiply(6, 5);
        assertEquals(expectedValue, result);
    }

    public void testMultiply2() throws CustomException {
        int expectedValue = 30;
        int result = calculator.multiply(0, 5);
        assertEquals(expectedValue, result);
    }

    public void testMultiply3() throws CustomException {
        int expectedValue = 30;
        int result = calculator.multiply(4, 0);
        assertEquals(expectedValue, result);
    }
}


