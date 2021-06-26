/**
 * This code tests whether maximum String among three is expected or not.
 *
 * @author Pratik chaudhari
 * @since 19/06/2021
 */
package com.pratik.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test
        // Maximum string at position 1.
    void WhenString1ShouldReturnMax() {
        String string1 = "Peach", string2 = "Lychee", string3 = "Guava";
        String max = MaxFinder.findMax(string1, string2, string3);
        Assertions.assertEquals("Peach", max, "Validating max method");
    }

    @Test
        // Maximum string at position 2.
    void WhenString2ShouldReturnMax() {
        String string1 = "Lychee", string2 = "Peach", string3 = "Guava";
        String max = MaxFinder.findMax(string1, string2, string3);
        Assertions.assertEquals("Peach", max, "Validating max method");
    }

    @Test
        // Maximum string at position 3.
    void WhenString3ShouldReturnMax() {
        String string1 = "Guava", string2 = "Lychee", string3 = "Peach";
        String max = MaxFinder.findMax(string1, string2, string3);
        Assertions.assertEquals("Peach", max, "Validating max method");
    }

    @Test
        // Testing whether code outputs expected maximum float or not.
    void WhenFloat1ShouldReturnMax() {
        Float float1 = 0.1f, float2 = 4.0f, float3 = 3.2f;
        Float max = MaxFinder.findMax(float1, float2, float3);
        Assertions.assertEquals(4.0f, max, "Validating max method");
    }

    @Test
        // Testing whether code outputs expected maximum float or not.
    void WhenFloat2ShouldReturnMax() {
        Float float1 = 4.0f, float2 = 0.1f, float3 = 3.2f;
        Float max = MaxFinder.findMax(float1, float2, float3);
        Assertions.assertEquals(4.0f, max, "Validating max method");
    }

    @Test
        // Testing whether code outputs expected maximum float or not.
    void WhenFloat3ShouldReturnMax() {
        Float float1 = 0.1f, float2 = 3.2f, float3 = 4.0f;
        Float max = MaxFinder.findMax(float1, float2, float3);
        Assertions.assertEquals(4.0f, max, "Validating max method");
    }

    @Test
        // Testing whether code outputs expected maximum integer or not.
    void WhenInteger1ShouldReturnMax() {
        Integer int1 = 4, int2 = 1, int3 = 3;
        Integer max = MaxFinder.findMax(int1, int2, int3);
        Assertions.assertEquals(4, max, "Validating max method");
    }

    @Test
        // Testing whether code outputs expected maximum integer or not.
    void WhenInteger2ShouldReturnMax() {
        Integer int1 = 1, int2 = 4, int3 = 3;
        Integer max = MaxFinder.findMax(int1, int2, int3);
        Assertions.assertEquals(4, max, "Validating max method");
    }

    @Test
        // Testing whether code outputs expected maximum integer or not.
    void WhenInteger3ShouldReturnMax() {
        Integer int1 = 1, int2 = 3, int3 = 4;
        Integer max = MaxFinder.findMax(int1, int2, int3);
        Assertions.assertEquals(4, max, "Validating max method");
    }
}
