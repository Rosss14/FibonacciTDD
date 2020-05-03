package org.example.factorial;

/**
 * Factorial function
 */
public class Factorial {
    public long compute(long value) {
        long result;
        if (value == 0 || value == 1) {
            result = 1;
        } else {
            result = value * compute(value - 1);
        }
        return result;
    }
}
