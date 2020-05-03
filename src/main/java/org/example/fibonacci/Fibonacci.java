package org.example.fibonacci;

public class Fibonacci {
    public long fib(long index){
        long result;
        if (index==1||index==2){
            result=1;
        }else{
            result=fib(index-1)+fib(index-2);
        }
        return result;
    }
}
