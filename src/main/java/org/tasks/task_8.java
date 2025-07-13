package org.tasks;

public class task_8 {
    /**
     * Checks if a string contains only digit characters.
     * Time Complexity: O(n), where n is length of string
     */
    public static boolean isAllDigits(String s) {
        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}