package Recursion;

public class Recursion {
    public static void main(String[] args) {
        // descRec(10);
        // System.out.println(fact(5));
        // System.out.println(sumSeries(10));
        // System.out.println(fib(5));
        // System.out.println(power(2, 4));
        System.out.println(optimizedPower(2, 4));
    }   
    
    // Print in descending order till n
    public static void descRec(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        descRec(n-1);
    }

    // Print in ascending order till n
    public static void incRec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        incRec(n-1);
        System.out.print(n + " ");   
    }

    // Factorial of n
    public static int fact(int n) {
        if (n == 1) 
            return 1;
        else 
            return n * fact(n-1);
    }

    // Sum of n natural numbers
    public static int sumSeries(int n) {
        if(n == 1) 
            return 1;
        else 
            return n + sumSeries(n-1);
    }

    // nth term of Fibonacci Series
    public static int fib(int n) {
        if (n <= 2)
            return n-1; 
        else 
            return fib(n-1) + fib(n - 2);
    }

    // x to the power n
    public static int power(int x, int n) {
        if (n == 0) 
            return 1;
        else 
            return x * power(x, n-1);
    }

    // optimized x to the power n
    public static int optimizedPower(int x, int n) {
        if (n == 0) 
            return 1;

        int halfPower =  optimizedPower(x, n/2);

        if(n % 2 == 0) 
            return halfPower * halfPower;
        else if (n % 2 != 0) 
            return x * halfPower * halfPower;
        else
            return -1;
    }
}
