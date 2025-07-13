package org.tasks;

public class task_2 {
    /**
     * Calculates and returns the average of elements in the array.
     * Time Complexity: O(n) - sums all elements.
     */
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;  // accumulate sum
        }
        return (double) sum / arr.length; // divide sum to the number of indexes to get avg
    }
}