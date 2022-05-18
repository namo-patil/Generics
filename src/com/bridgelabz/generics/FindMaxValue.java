package com.bridgelabz.generics;

public class FindMaxValue {
    private static void maxIntegerValue(Integer number1, Integer number2, Integer number3) {
        Integer maximumValue = number1;
        if (number2.compareTo(maximumValue) > 0) {
            maximumValue = number2;
        }
        if (number3.compareTo(maximumValue) > 0) {
            maximumValue = number3;
        }
        System.out.println("Maximum Integer Value : " + maximumValue);
    }

    private static void maxFloatValue(Float number1, Float number2, Float number3) {
        Float maximumValue = number1;
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
        maxFloatValue(2.4f, 4.5f, 1.2f);
    }
}
