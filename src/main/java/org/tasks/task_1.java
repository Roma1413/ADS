package org.tasks;

public class task_1 {
    /**
     * Finds and returns the minimum value in the array.
     * Time Complexity: O(n) - must scan all elements once.
     */
    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];  // update if a smaller element is found
        }
        return min;
    }
}