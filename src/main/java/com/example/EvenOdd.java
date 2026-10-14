package com.example;

public class EvenOdd {

    public String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        int number = 8;

        System.out.println("Number: " + number);
        System.out.println("Result: " + obj.checkEvenOdd(number));
    }
}