package org.tasks;

public class task_10 {
    /**
     * Recursively computes the GCD of two numbers using Euclidean Algorithm.
     * Time Complexity: O(log(min(a, b)))
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}