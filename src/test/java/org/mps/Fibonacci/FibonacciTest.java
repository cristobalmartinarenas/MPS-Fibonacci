package org.mps.Fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Fibonacci
 * 0   ->  0
 * 1   ->  1
 * 2   ->  1
 * 3   ->  2
 * 4   ->  3
 * 5   ->  6
 * 20  ->  6765
 * Neg ->  Error
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
    public void ShouldReturnZeroIfNumberIsZero(){
        int expectedValue = 0;
        int obtainedValue = fib.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void ShouldReturnOneIfNumberIsOne(){
        int expectedValue = 0;
        int obtainedValue = fib.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void ShouldReturnOneIfNumberIsTwo(){
        int expectedValue = 0;
        int obtainedValue = fib.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void ShouldReturnTwoIfNumberIsThree(){
        int expectedValue = 0;
        int obtainedValue = fib.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void ShouldReturnThreeIfNumberIsFour(){
        int expectedValue = 0;
        int obtainedValue = fib.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void ShouldReturnFiveIfNumberIsFive(){
        int expectedValue = 0;
        int obtainedValue = fib.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void ShouldReturn6765IfNumberIs20(){
        int expectedValue = 0;
        int obtainedValue = fib.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void ShouldThrowExceptionIfNumberIsNegative(){
        assertThrows(IllegalArgumentException.class, () -> fib.compute(-1));
    }
}
