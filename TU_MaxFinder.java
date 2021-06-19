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
    @Test   // Maximum string at position 1.
    void WhenString1ShouldReturnMax() {
        String string1 = "Peach", string2 = "Lychee", string3 = "Guava";
        String max = MaxFinder.findMax(string1, string2, string3);
        Assertions.assertEquals("Peach",max,"Validating max method");
    }
    @Test   // Maximum string at position 2.
    void WhenString2ShouldReturnMax() {
        String string1 = "Lychee", string2 = "Peach", string3 = "Guava";
        String max = MaxFinder.findMax(string1, string2, string3);
        Assertions.assertEquals("Peach",max,"Validating max method");
    }
    @Test   // Maximum string at position 3.
    void WhenString3ShouldReturnMax() {
        String string1 = "Guava", string2 = "Lychee", string3 = "Peach";
        String max = MaxFinder.findMax(string1, string2, string3);
        Assertions.assertEquals("Peach",max,"Validating max method");
    }
}
