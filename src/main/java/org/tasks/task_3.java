package org.tasks;

public class task_3 {
    /**
     * Checks if a number is prime using recursion.
     * Time Complexity: O(√n) - checks divisibility up to sqrt(n)
     */
    public static boolean isPrime(int n) {
        return isPrimeHelper(n, 2);
    }

    private static boolean isPrimeHelper(int n, int i) {
        if (n <= 1) return false;
        if (i * i > n) return true;         // no divisor found
        if (n % i == 0) return false;       // found a divisor
        return isPrimeHelper(n, i + 1);     // check next i
    }
}