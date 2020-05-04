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
     * (1,5) -> 1
     * (2,3) -> 1
     * (4,1) -> 3
     * (5,3) -> 19
     * (-1,3),(10,0) -> IndexOutOfBoundsException
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
        long actualValue=fibonacci.compute(1,5);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldThe2ndElementOfFibonacciSequenceBe1(){
        long expectedValue = 1;
        //Fibonacci fibonacci = new Fibonacci();
        long actualValue=fibonacci.compute(2,3);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldThe4thElementOfFibonacciSequenceBe3(){
        long expectedValue = 3;
        //Fibonacci fibonacci = new Fibonacci();
        long actualValue=fibonacci.compute(4,1);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldThe6thElementOfFibonacciSequenceBe8(){
        long expectedValue = 19;
        //Fibonacci fibonacci = new Fibonacci();
        long actualValue=fibonacci.compute(5,3);
        assertEquals(expectedValue,actualValue);
    }

    @Test
    public void shouldNegativeParametersOr0RaiseAnException(){
        //Check whether value of 'index' in the admitted range is assured
        assertThrows(IndexOutOfBoundsException.class,()-> fibonacci.compute(-1,3));
        assertThrows(IndexOutOfBoundsException.class,()-> fibonacci.compute(41,3));
        //Check whether value of 'rate' in the admitted range is assured
        assertThrows(IndexOutOfBoundsException.class,()-> fibonacci.compute(10,0));
        assertThrows(IndexOutOfBoundsException.class,()-> fibonacci.compute(10,7));
    }

    @AfterEach
    public void fin(){
        fibonacci = null;
    }
}
