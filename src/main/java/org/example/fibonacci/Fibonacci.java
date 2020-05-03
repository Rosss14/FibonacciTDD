package org.example.fibonacci;

/**
 * Class to return the member at the specified position in
 * Fibonacci sequence. Position indexes start at 1 (not 0)
 */

public class Fibonacci {
    public long fib(long index){
        long result;
        if (index==1||index==2){
            result=1;
        }else if(index>2){
            result=fib(index-1)+fib(index-2);
        }else{
            throw new IndexOutOfBoundsException("The index must be a positive integer");
        }
        return result;
    }
}
