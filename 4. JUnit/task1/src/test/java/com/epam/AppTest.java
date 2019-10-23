package com.epam;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @BeforeEach
    void init() {
        System.out.println("Before each message");
    }

    @AfterEach
    void finalizeTest() {
        System.out.println("After each message");
    }

    @BeforeAll
    static void privet() {
        System.out.println("Before all message");
    }

    @AfterAll
    static void poka() {
        System.out.println("After all message");
    }

    @Test
    void testConcatenateWords() {
        String expected = "EPAM company";
        assertEquals(expected, new App().concatenateWords("EPAM", "company"));
    }

    @Test
    void testComputeFactorial() {
        int expected = 24;
        int value = 4;
        assertEquals(expected, new App().computeFactorial(value));
    }

    @Test
    void testComputeFactorialWithTimeOut() {
        int value = 200;
        Assertions.assertTimeout(Duration.ofMillis(5), () -> new App().computeFactorial(value));
    }

    @Test
    void testComputeFactorialIllegalArgument() {
        int value = -5;
        assertThrows(IllegalArgumentException.class, () -> new App().computeFactorial(value));
    }

    @Disabled
    @Test
    void testComputeFactorialIllegalArgumentProduction() {
        int value = 50;
        assertThrows(IllegalArgumentException.class, () -> new App().computeFactorial(value));
    }
}
