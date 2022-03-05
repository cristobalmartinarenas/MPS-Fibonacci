package org.mps.Fibonacci;

public class Fibonacci {
    public int compute(int num){
        if(num == 0){ return 0; }
        if(num == 1){ return 1; }

        return compute(num - 1) + compute(num - 2);
    }
}
