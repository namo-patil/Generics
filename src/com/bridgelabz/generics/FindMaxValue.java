package com.bridgelabz.generics;

public class FindMaxValue {
    public static void maxIntegerValue(Integer number1, Integer number2, Integer number3) {
        Integer maximumValue = number1;
        if (number2.compareTo(maximumValue) > 0) {
            maximumValue = number2;
        }
        if (number3.compareTo(maximumValue) > 0) {
            maximumValue = number3;
        }
        System.out.println("Maximum Integer Value : " + maximumValue);
    }

    public static void main(String[] args) {
        maxIntegerValue(30, 60, 80);
    }
}
