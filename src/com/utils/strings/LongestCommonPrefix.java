package com.utils.strings;


/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 *
 *
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] inputArray = {""};
        System.out.println( "Output is : " + longestCommonPrefix(inputArray));
        //maxNumber();

    }

    private static String longestCommonPrefix(String[] inputStringArray) {
        String prefix = "";

        if(inputStringArray == null || inputStringArray.length == 0){
            return prefix;
        }
        for(String string : inputStringArray){
            if(prefix.equals(string)){
                return prefix;
            }
        }

        for(int i = 0 ; i < inputStringArray.length ;i++){
            char currentCharacter = inputStringArray[0].charAt(i);
            for(int  j = 1; j< inputStringArray.length ; j++){
                //if the length doesnt match between two strings then return false
                if (i >= inputStringArray[j].length() || inputStringArray[j].charAt(i) != currentCharacter) {
                    return prefix;
                }
            }
            prefix = prefix + currentCharacter;
        }
        return  prefix;
    }

    private static void maxNumber(){

        int[] intArray = {100,10,20,30};
        int max = intArray[0];

        for(int i = 1 ; i < intArray.length  ; i++){
            if(intArray[i] > max){
                max = intArray[i];
            }
        }
        System.out.println(max);

    }
}
