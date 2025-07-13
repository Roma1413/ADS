package org.tasks;

public class task_2 {
    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        return (double) sum / arr.length;
    }
}
