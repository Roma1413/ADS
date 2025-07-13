package org.tasks;

public class task_4 {
    /**
     * Computes factorial of n using recursion.
     * Time Complexity: O(n)
     */
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}