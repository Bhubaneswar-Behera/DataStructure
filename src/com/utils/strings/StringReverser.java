package com.utils.strings;

/**
 * Write a function that reverses a string. The input string is given as an array of characters char[].
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 * Input: ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 *
 * Example 2:
 * Input: ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 *
 *
 */
public class StringReverser {
    public static void main(String[] args) {
        String str = "hello";
        reverseString(str.toCharArray());
    }

    private static  void reverseString(char[] charArray) {
        int startIndex = 0;
        int endIndex  = charArray.length -1 ;

        while(startIndex < endIndex) {
            char temp  = charArray[startIndex];
            charArray[startIndex] = charArray[endIndex];
            charArray[endIndex] = temp;
            startIndex ++;
            endIndex--;
        }
        System.out.println(charArray);

    }
}
