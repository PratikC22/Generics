/**
 * This code tests and checks maximum among given inputs.
 * supports int, float, string
 *
 * @author Pratik Chaudhari
 * @since 19/06/2021
 */
package com.pratik.max;

public class MaxFinder <T extends Comparable<T>> {
    T num1;
    T num2;
    T num3;

    public MaxFinder(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public MaxFinder() {
    }

    /**
     * UC 1: method for finding maximum integer value
     */
    public static Integer findMax(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    /**
     * UC 2:  method for finding maximum float value
     */
    public static Float findMax(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    /**
     * UC 3:  method for finding maximum String value
     */
    public static String findMax(String str1, String str2, String str3) {
        String max = str1;
        if (str2.compareTo(max) > 0) {
            max = str2;
        }
        if (str3.compareTo(max) > 0) {
            max = str3;
        }
        return max;
    }

    /**
     * using generics find Maximum value of String
     */
    public static <T extends Comparable<T>> T GenericMax(T num1, T num2, T num3) {
        T max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }

    public T GenericMax() {
        return MaxFinder.GenericMax(num1, num2, num3);
    }

    public static void main(String[] args) {
        System.out.println("Maximum Value of Integer given is :" + findMax(6, 3, 9));
        System.out.println("Maximum value of Float numbers given is :" + findMax(1.0f, 5.0f, 3.0f));
        System.out.println("Maximum value of String given is :" + findMax("Boy", "Girl", "Animal"));
        System.out.println("Maximum value of String given is :" + GenericMax("Boy", "Girl", "Animal"));
        System.out.println("Maximum Integer by creating Generic class :" + new MaxFinder<Integer>(3, 6, 2).GenericMax());
    }
}
