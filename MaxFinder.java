/**
 * This code tests and checks maximum String among three Strings.
 *
 * @author Pratik Chaudhari
 * @since 19/06/2021
 */
package com.pratik.max;

import java.util.Scanner;
//Utilising compareTo method to find largest String among three.
public class MaxFinder {
    public static String findMax(String string1, String string2, String string3) {
        String max = string1;
        if(string2.compareToIgnoreCase(max) > 0)
            max = string2;
        if(string3.compareToIgnoreCase(max) > 0)
            max = string3;
        System.out.printf("Max value of %s %s %s is %s. \n", string1, string2, string3, max);

        return max;
    }
    // Main method
    public static void main(String[] args) {
        String string1 = "apple", string2 = "banana", string3 = "orange";
        findMax(string1, string2, string3);
    }
}
