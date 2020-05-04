package org.example.fibonacci;

/**
 * Class to return the member at the specified position in
 * Fibonacci sequence. Position indexes start at 1 (not 0)
 */

public class Fibonacci {
    public long compute(long index, long rate){
        long result;
        if (index>0 && index<=40 && rate>0 && rate <= 5){
            if (index == 1 || index == 2) {
                result = 1;
            } else { // index > 2;
                result = compute(index - 1, rate) + (rate * compute(index - 2, rate));
            }
        }else {
            throw new IndexOutOfBoundsException("The index must be an integer in (0,40] and rate must be an integer in (0,5]");
        }
        return result;
    }
}
