package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testAddFunction() {
        App app = new App();
        assertTrue(app.add(2, 3) == 5);
    }

    @Test
    public void testSubtractFunction() {
        App app = new App();
        assertTrue(app.subtract(5, 3) == 2);
    }

    @Test
    public void testMultiplyFunction() {
        App app = new App();
        assertTrue(app.multiply(2, 3) == 6);
    }

    @Test
    public void testDivideFunction() {
        App app = new App();
        assertTrue(app.divide(6, 3) == 2.0);
    } 


    /* 
    
    // Test for division by zero. This test should fail
    @Test
    public void testDivideByZero() {
        App app = new App();
        try {
            app.divide(6, 0);
            assertTrue(false); 
        } catch (ArithmeticException e) {
            assertTrue(true); 
        }
    } */
}
