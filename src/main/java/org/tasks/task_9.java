package org.tasks;

public class task_9 {
    /**
     * Computes C(n, k) recursively using Pascal's identity:
     * C(n, k) = C(n-1, k-1) + C(n-1, k),
     * Base Case: C(n, 0) = C(n, n) = 1
     * Time Complexity: O(2^n) - naive recursive
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}