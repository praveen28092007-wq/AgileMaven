package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OddOrEvenTest {

    @Test
    void testEven() {
        EvenOdd obj = new EvenOdd();
        assertEquals("Even", obj.checkEvenOdd(8));
    }

    @Test
    void testOdd() {
        EvenOdd obj = new EvenOdd();
        assertEquals("Odd", obj.checkEvenOdd(7));
    }
}