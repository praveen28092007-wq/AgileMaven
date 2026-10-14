package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestOfThreeTest {
    @Test
    void testLargest() {
        LargestOfThree obj = new LargestOfThree();
        assertEquals(9, obj.largest(4, 9, 6));
    }
    void testLargest() {
        LargestOfThree obj = new LargestOfThree();
        assertEquals(9, obj.largest(4));
    }
}
