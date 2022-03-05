package org.mps.Fibonacci;

public class Fibonacci {
    public int compute(int num){
        if(num == 0){ return 0; }
        if(num == 1){ return 1; }

        int fibPre = 0;
        int fibAns = 1;

        for(int i = 2; i <= num; i++){
            int currentFib = fibAns + fibPre; //Fib(n) = Fib(n-1) + Fib(n-2)

            fibPre = fibAns;
            fibAns = currentFib;
        }

        return fibAns;
    }
}
