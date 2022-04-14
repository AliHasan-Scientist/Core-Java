// Write Recursive Method which print the numbers from 5 to 1.
package Recursions;

/**
 * Five_to_One
 */
public class Five_to_One {
    public static void iterNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        iterNumber(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        Five_to_One.iterNumber(n);
    }
}