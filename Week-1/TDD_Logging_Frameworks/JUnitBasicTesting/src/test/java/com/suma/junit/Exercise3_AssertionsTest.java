package com.suma.junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Exercise3_AssertionsTest {

    Calculator calc = new Calculator();

    @Test
    void testAssertions() {

        assertEquals(5, calc.add(2, 3));

        assertNotEquals(6, calc.add(2, 3));

        assertTrue(calc.add(2, 3) == 5);

        assertFalse(calc.add(2, 3) == 10);

        assertNotNull(calc);

        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
    }
}
