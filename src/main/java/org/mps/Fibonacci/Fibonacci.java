package org.mps.Fibonacci;

/**
*   Class providing a method that computes the i
*   fibonacci number
*
*   @author Cristobal Martin
 */
public class Fibonacci {

    /**
     * Computes the given fibonacci number
     * @param num index of the fibonacci number to be computed
     * @return i fibonacci number
     *
     * @throws IllegalArgumentException the index cannot be negative
     */
    public double compute(int num){
        if(num < 0){ throw new IllegalArgumentException("Number can't be negative: " + num); }
        if(num == 0){ return 0; }

        double fibPre = 0;
        double fibAns = 1;

        for(int i = 2; i <= num; i++){
            double currentFib = fibAns + fibPre; //Fib(n) = Fib(n-1) + Fib(n-2)

            fibPre = fibAns;
            fibAns = currentFib;
        }

        return fibAns;
    }
}
