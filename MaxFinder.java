/**
 * This code tests and checks maximum integer among three integers.
 *
 * @author Pratik Chaudhari
 * @since 19/06/2021
 */
package com.pratik.max;

public class MaxFinder {
    public static Integer findMax(Integer int1, Integer int2, Integer int3) {
        Integer max = int1;
	//Utilising compareTo method to find largest integer among three.
        if (int2.compareTo(max)>0) {
            max = int2;
        }
        if (int3.compareTo(max)>0) {
            max = int3;
        }
        System.out.printf("Max value of %s %s %s is : %s\n", int1,int2,int3,max);
        return max;
    }
    // Main method.
    public static void main(String[] args) {
        Integer int1 = 15, int2 = 23, int3 = 39;
        Integer max = findMax(int1, int2, int3);
    }
}
