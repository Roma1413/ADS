package org.tasks;

public class task_7 {
    /**
     * Recursively prints array elements in reverse order.
     * Time Complexity: O(n)
     */
    public static void reversePrint(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");  // print current element
        reversePrint(arr, index - 1);        // recurse with previous index
    }
}