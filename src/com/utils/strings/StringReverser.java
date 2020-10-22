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
        reverseWithStringBuilderReverse(str);
        reverseWithStringBuilderWithoutReverse(str);
        reverse(str);
    }

    private static void reverseWithStringBuilderReverse (String str) {
        System.out.println( new StringBuilder(str).reverse().toString());
    }

    private static void reverseWithStringBuilderWithoutReverse (String str) {

        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = str.toCharArray();

        for(int i = str.length() -1 ; i >= 0 ; i --) {
            stringBuilder.append(chars[i]);
        }
        System.out.println(stringBuilder.toString());
    }

    private static void reverse(String str){
        char[] chars = str.toCharArray();
        int startIndex = 0;
        int endIndex = str.length() - 1;

        while(startIndex < endIndex){

            //Put the first character in the temp
            char temp = chars[startIndex];

            //Put the last character in place of first
            chars[startIndex] = chars[endIndex];

            //put the temp in the last place now
            chars[endIndex] = temp;

            startIndex ++;
            endIndex --;
        }

        System.out.println(chars);
    }


}
