/**
 * This code tests and checks maximum floats among three floats.
 *
 * @author Pratik Chaudhari
 * @since 19/06/2021
 */
package com.pratik.max;

public class MaxFinder {
    public static Float findMax(Float float1, Float float2, Float float3) {
        Float max = float1;
        //Utilising compareTo method to find largest float among three.
        if (float2.compareTo(max)>0) {
            max = float2;
        }
        if (float3.compareTo(max)>0) {
            max = float3;
        }
        System.out.printf("Max value of %s %s %s is : %s\n", float1, float2, float3, max);
        return max;
    }
    // Main method
    public static void main(String[] args) {
        Float float1 = 15.2f, float2 = 23.5f, float3 = 3.39f;
        Float max = findMax(float1, float2, float3);
    }
}
