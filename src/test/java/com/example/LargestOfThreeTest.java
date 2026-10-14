package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class LargestOfThreeTest {
    @Test
    void testLargest() {
        LargestOfThree obj = new LargestOfThree();
        assertEquals(9, obj.largest(4, 9, 6));
    }

    @Test
    void testLargestWhenFirstIsGreatest() {
        LargestOfThree obj = new LargestOfThree();
        assertEquals(19, obj.largest(10, 4, 6));
    }
}
