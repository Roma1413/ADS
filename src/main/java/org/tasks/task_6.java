package org.tasks;

public class task_6 {
    /**
     * Computes a^n using recursion.
     * Time Complexity: O(n).
     */
    public static long power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1); // use of power function
    }
}