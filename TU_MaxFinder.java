/**
 * This code tests whether maximum floats among three is expected or not.
 *
 * @author Pratik chaudhari
 * @since 19/06/2021
 */
package com.pratik.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test   // Testing whether code outputs expected maximum float or not.
    void WhenFloatShouldReturnMax() {
        Float float1 = 0.1f, float2 = 4.0f, float3 = 3.2f;
        Float max = MaxFinder.findMax(float1, float2, float3);
        Assertions.assertEquals(4.0f,max,"Validating max method");
    }
}
