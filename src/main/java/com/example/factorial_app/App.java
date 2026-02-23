package com.example.factorial_app;

public class App {

    public static long findFactorial(int number) {
        long factorial = 1;
        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + findFactorial(num));
    }
}
