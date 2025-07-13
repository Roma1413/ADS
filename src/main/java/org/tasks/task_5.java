package org.tasks;

public class task_5 {
    /**
     * Recursively computes the nth Fibonacci number.
     * Time Complexity: O(2^n) - exponential (naive recursion).
     * Use memoization or iteration for efficiency if n > 30.
     */
    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}