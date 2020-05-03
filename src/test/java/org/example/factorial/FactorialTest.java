package org.example.factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for class Factorial.
 */
public class FactorialTest
{
    /**
     * Test cases:
     * 0 -> 1
     * 1 -> 1
     * 2 -> 2
     * 4 -> 24
     */
    Factorial factorial = null;

    @BeforeEach
    public void initialize(){
        factorial = new Factorial();
    }

    @Test
    public void shouldFactorialOf0return1(){
        //Factorial factorial = new Factorial();

        long expectedValue = 1;
        long actualValue = factorial.compute(0);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldFactorialOf1return1(){
        //Factorial factorial = new Factorial();

        long expectedValue = 1;
        long actualValue = factorial.compute(1);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldFactorialOf2return2(){
        //Factorial factorial = new Factorial();

        long expectedValue = 2;
        long actualValue = factorial.compute(2);

        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldFactorialOf4return24(){
        //Factorial factorial = new Factorial();

        long expectedValue = 24;
        long actualValue = factorial.compute(4);

        assertEquals(expectedValue,actualValue);
    }

    @AfterEach
    public void finish(){
        factorial = null;
    }
}
