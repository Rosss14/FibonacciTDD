package org.example.fibonacci;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
     * -1 -> IndexOutOfBoundsException
     */
    Fibonacci fibonacci = null;

    @BeforeEach
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

    @Test
    public void shouldNegativeIndexOr0RaiseAnException(){
        assertThrows(IndexOutOfBoundsException.class,()-> fibonacci.fib(-1));
    }

    @AfterEach
    public void fin(){
        fibonacci = null;
    }
}
