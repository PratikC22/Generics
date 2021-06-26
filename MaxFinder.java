/**
 * This code tests and checks maximum among given inputs.
 * supports int, float, string
 *
 * @author Pratik Chaudhari
 * @since 19/06/2021
 */
package com.pratik.max;

import java.util.Scanner;

public class MaxFinder {
    // Main method
    public static void main(String[] args) {

        System.out.println("Maximum Value of Integer given is : " + GenericMax(6, 3, 9));
        System.out.println("Maximum value of Float numbers given is : " + GenericMax(1.0f, 5.0f, 3.0f));
        System.out.println("Maximum value of String given is : " + GenericMax("Apple", "Peach", "Banana"));
        System.out.println("Maximum value of String given is : " + GenericMax("Apple", "Peach", "Banana"));

    }

    // Generic method
    public static <T extends Comparable<T>> T GenericMax(T num1, T num2, T num3) {
        T max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }

    public static Integer findMax(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }

    public static Float findMax(Float float1, Float float2, Float float3) {
        Float max = float1;
        if (float2.compareTo(max) > 0) {
            max = float2;
        }
        if (float3.compareTo(max) > 0) {
            max = float3;
        }

        return max;
    }

    public static String findMax(String string1, String string2, String string3) {
        String max = string1;
        if (string2.compareToIgnoreCase(max) > 0)
            max = string2;
        if (string3.compareToIgnoreCase(max) > 0)
            max = string3;
        return max;
    }
}
