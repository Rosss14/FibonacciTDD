package org.example.fibonacci;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for class Fibonacci
 */

public class FibonacciTest {

    /**
     * Test cases:
     * 1 -> 1
     * 2 -> 1
     * 4 -> 3
     * 6 -> 8
     */
    Fibonacci fibonacci = null;

    @Before
    public void init(){
        fibonacci = new Fibonacci();
    }

    @Test
    public void shouldThe1stElementOfFibonacciSequenceBe1(){
        long expectedValue = 1;
        //Fibonacci fibonacci = new Fibonacci();
        long actualValue=fibonacci.fib(1);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldThe2ndElementOfFibonacciSequenceBe1(){
        long expectedValue = 1;
        //Fibonacci fibonacci = new Fibonacci();
        long actualValue=fibonacci.fib(2);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldThe4thElementOfFibonacciSequenceBe3(){
        long expectedValue = 3;
        //Fibonacci fibonacci = new Fibonacci();
        long actualValue=fibonacci.fib(4);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldThe6thElementOfFibonacciSequenceBe8(){
        long expectedValue = 8;
        //Fibonacci fibonacci = new Fibonacci();
        long actualValue=fibonacci.fib(6);
        assertEquals(expectedValue,actualValue);
    }

    @After
    public void fin(){
        fibonacci = null;
    }
}
