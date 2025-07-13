package org.tasks;

import static org.tasks.task_1.findMinimum;
import static org.tasks.task_10.gcd;
import static org.tasks.task_2.findAverage;
import static org.tasks.task_3.isPrime;
import static org.tasks.task_4.factorial;
import static org.tasks.task_5.fibonacci;
import static org.tasks.task_6.power;
import static org.tasks.task_7.reversePrint;
import static org.tasks.task_8.isAllDigits;
import static org.tasks.task_9.binomialCoefficient;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Problem 1
        int[] arr1 = {10, 1, 32, 3, 45};
        System.out.println("Min: " + findMinimum(arr1));

        // Problem 2
        int[] arr2 = {3, 2, 4, 1};
        System.out.println("Average: " + findAverage(arr2));

        // Problem 3
        System.out.println("Is 7 prime? " + (isPrime(7) ? "Prime" : "Composite"));

        // Problem 4
        System.out.println("Factorial of 5: " + factorial(5));

        // Problem 5
        System.out.println("Fibonacci(5): " + fibonacci(5));
        System.out.println("Fibonacci(17): " + fibonacci(17));

        // Problem 6
        System.out.println("2^10: " + power(2, 10));

        // Problem 7
        int[] arr3 = {2, 6, 4, 1};
        System.out.print("Reversed: ");
        reversePrint(arr3, arr3.length - 1);
        System.out.println();

        // Problem 8
        System.out.println("123456: " + (isAllDigits("123456") ? "Yes" : "No"));
        System.out.println("123a12: " + (isAllDigits("123a12") ? "Yes" : "No"));

        // Problem 9
        System.out.println("C(7,3): " + binomialCoefficient(7, 3));

        // Problem 10
        System.out.println("GCD of 32 and 48: " + gcd(32, 48));
    }
}
