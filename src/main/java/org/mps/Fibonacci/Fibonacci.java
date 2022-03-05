package org.mps.Fibonacci;

/*
    Class providing a method that computes the i
    fibonacci number

    @author Cristobal Martin
 */
public class Fibonacci {
    public int compute(int num){
        if(num < 0){ throw new IllegalArgumentException("Number can't be negative: " + num); }
        if(num == 0){ return 0; }

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
