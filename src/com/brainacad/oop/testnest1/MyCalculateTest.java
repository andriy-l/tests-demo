package com.brainacad.oop.testnest1;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class MyCalculateTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testCalcSum() {
        MyCalculate myCalculate = new MyCalculate();
        double expected = 4;
        double actual = myCalculate.calcSum(2, 2);
        assertEquals(expected, actual,0);
//        fail("Not yet implemented");
    }

    @Test
    public void testCalcSub() {
        MyCalculate myCalculate = new MyCalculate();
        double expected = 4;
        double actual = myCalculate.calcSub(7, 3);
        assertEquals("Test not passed as: ",expected, actual, 0);
//        fail("Not yet implemented");
    }

    @Test
    public void testAddVector() {
        MyCalculate myCalculate = new MyCalculate();
        double[] expected = {.1, .2, .3, .4, .5, .6};
        double[] a = new double[]{0.0, .1, .2 };
        double[] b = new double[]{0, .1, .1};

        double[] actual = myCalculate.addVector(a, b);
//        actual = null;
        assertEquals(expected, actual);
        Assume.assumeNotNull("array was null", actual);

    }

    @Ignore
    @Test
    public void testCalcMult() {
        fail("Not yet implemented");
    }

    @Test(expected=ArithmeticException.class, timeout=100) //milliseconds
    public void testCalcDiv() {
        fail("Not yet implemented");
    }

}