package com.bridgelabz.generics;

public class FindMaxValue<T extends Comparable<T>> {
    T x, y, z;

    public FindMaxValue(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    private static <T extends Comparable<T>> T maxValue(T x, T y, T z) {

        T maximumValue = x;
        if (y.compareTo(maximumValue) > 0) {
            maximumValue = y;
        }
        if (z.compareTo(maximumValue) > 0) {
            maximumValue = z;
        }
        System.out.println("Maximum Value is : " + maximumValue);
        return maximumValue;
    }

    public static void main(String[] args) {
        Integer x = 30, y = 60, z = 80;
        Float a = 2.4f, b = 3.87f, c = 6.45f;
        String str1 = "Apple", str2 = "Peach", str3 = "Banana";
        maxValue(x, y, z);
        maxValue(a, b, c);
        maxValue(str1, str2, str3);
    }
}
