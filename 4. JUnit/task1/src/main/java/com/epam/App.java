package com.epam;

public class App {
    public static void main(String[] args) {

    }

    String concatenateWords(String a, String b) {
        return String.join(" ", a, b);
    }

    public int computeFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Zero or positive value expected");
        }
        if (n == 0) {
            return 1;
        }
        return n * computeFactorial(n - 1);
    }
}
