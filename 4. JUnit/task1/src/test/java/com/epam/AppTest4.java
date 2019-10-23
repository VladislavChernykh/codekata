package com.epam;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest4 {
    @Before
    public void init() {
        System.out.println("Before each message");
    }

    @After
    public void finalizeTest() {
        System.out.println("After each message");
    }

    @BeforeClass
    public static void privet() {
        System.out.println("Before all message");
    }

    @AfterClass
    public static void poka() {
        System.out.println("After all message");
    }

    @Test
    public void testConcatenateWords() {
        String expected = "EPAM company";
        assertEquals(expected, new App().concatenateWords("EPAM", "company"));
    }

    @Test
    public void testComputeFactorial() {
        int expected = 24;
        int value = 4;
        assertEquals(expected, new App().computeFactorial(value));
    }

    @Test(timeout = 5)
    public void testComputeFactorialWithTimeOut() {
        int value = 200;
        new App().computeFactorial(value);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testComputeFactorialIllegalArgument() {
        int value = -5;
        new App().computeFactorial(value);
    }

    @Ignore
    @Test(expected = IllegalArgumentException.class)
    public void testComputeFactorialIllegalArgumentProduction() {
        int value = 50;
        new App().computeFactorial(value);
    }
}
