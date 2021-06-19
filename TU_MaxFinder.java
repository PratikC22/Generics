/**
 * This code tests whether maximum integer among three is expected or not.
 *
 * @author Pratik chaudhari
 * @since 19/06/2021
 */
package com.pratik.max;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TU_MaxFinder {
    @Test	// Testing whether code outputs expected maximum integer or not.
    void WhenIntegerShouldReturnMax() {
        Integer int1 = 1, int2 = 4, int3 = 3;
        Integer max = MaxFinder.findMax(int1, int2, int3);
        Assertions.assertEquals(4,max,"Validating max method");
    }
}
