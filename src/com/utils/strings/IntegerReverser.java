package com.utils.strings;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Note:
 * Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * Example 1:
 * Input: x = 123
 * Output: 321
 *
 * Example 2:
 * Input: x = -123
 * Output: -321
 *
 * Example 3:
 * Input: x = 120
 * Output: 21
 *
 * Example 4:
 * Input: x = 0
 * Output: 0
 *
 */

public class IntegerReverser {
    public static void main(String[] args) {
        int input = 123;

        System.out.println(reverseInt(input));


    }
    private static int reverseInt(int input) {
        boolean negativeFlag = false;
        if (input < 0) {
            negativeFlag = true;
            input = input * -1;
        }

        long reversed = 0;

        while (input > 0) {
            reversed = (reversed * 10) + (input % 10);
            input = input / 10;
        }
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }

        return negativeFlag ? (int)reversed * -1 : (int) reversed;
    }
}
