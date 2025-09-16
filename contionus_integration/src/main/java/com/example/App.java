package com.example;

public class App {

    public static void main(String[] args) {
        System.out.println("Calculator App");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        return (double) a / b; // Dividing by zero should fail with this implementation
    }

    // Calculate procent of a number 
    public double procent(int total_number, int procent) {
        return (double) (total_number * procent) / 100;
    }
}
