package com.utils.strings;


import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character in it and return its index.
 *  If it doesn't exist, return -1.
 *
 * Examples:
 * s = "leetcode"
 * return 0.
 *
 * s = "loveleetcode"
 * return 2.
 *
 *
 */
public class StringUniqueCharacter {
    public static void main(String[] args) {
        String inputString = "loveleetcode";
        System.out.println(firstUniqueChar(inputString));

    }
    private static int firstUniqueChar(String inputString) {
        Map<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0 ; i < inputString.length() ; i++){
            char currentCharacter = inputString.charAt(i);
            hashMap.put(currentCharacter,hashMap.getOrDefault(currentCharacter,0)+1);
        }

        //find the first index
        for(int i = 0 ; i < inputString.length() ; i++){
            if(hashMap.get(inputString.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
}
