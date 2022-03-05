package org.mps.Fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Index / Expected value
 *  0   ->   0
 *  1   ->   1
 *  2   ->   1
 *  3   ->   2
 *  4   ->   3
 *  5   ->   6
 *  20  ->   6765
 *  Neg ->   Error
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
        double expectedValue = 0;
        double obtainedValue = fib.compute(0);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void ShouldReturnOneIfNumberIsOne(){
        double expectedValue = 1;
        double obtainedValue = fib.compute(1);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void ShouldReturnOneIfNumberIsTwo(){
        double expectedValue = 1;
        double obtainedValue = fib.compute(2);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void ShouldReturnTwoIfNumberIsThree(){
        double expectedValue = 2;
        double obtainedValue = fib.compute(3);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void ShouldReturnThreeIfNumberIsFour(){
        double expectedValue = 3;
        double obtainedValue = fib.compute(4);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void ShouldReturnFiveIfNumberIsFive(){
        double expectedValue = 5;
        double obtainedValue = fib.compute(5);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void ShouldReturn6765IfNumberIs20(){
        double expectedValue = 6765;
        double obtainedValue = fib.compute(20);

        assertEquals(expectedValue, obtainedValue);
    }

    @Test
    public void ShouldThrowExceptionIfNumberIsNegative(){
        assertThrows(IllegalArgumentException.class, () -> fib.compute(-1));
    }
}
