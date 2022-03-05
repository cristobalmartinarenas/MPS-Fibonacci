package org.mps.Fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Fibonacci
 * 0  ->  0
 * 1  ->  1
 * 2  ->  1
 * 3  ->  2
 * 4  ->  3
 * 5  ->  6
 * 20 ->  6765
 */

public class FibonacciTest {
    private Fibonacci fib;

    @BeforeEach
    public void InitTests(){
        fib = new Fibonacci();
    }

    @AfterEach
    public void FinishTests(){
        fib = null;
    }

    @Test
    public void ShouldReturnZeroIfNumberIZero(){
        int expectedValue = 0;
        int obtainedValue = fib.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }
}
