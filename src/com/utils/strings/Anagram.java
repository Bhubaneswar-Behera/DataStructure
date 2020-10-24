package com.utils.strings;


import java.util.HashMap;

/**
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 *
 * Example 1:
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Example 2:
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Note:
 * You may assume the string contains only lowercase alphabets.
 *
 */
public class Anagram {
    public static void main(String[] args) {
        String firstString = "anagram";
        String secondString = "nagaram";
        System.out.println(isAnagram(firstString,secondString));
        System.out.println(isAnagramUsingMap(firstString,secondString));
    }

    private static boolean isAnagram(String firstString, String secondString) {
        if(firstString.length() != secondString.length()){
            return false;
        }

        int[] characterCount = new int[26];

        for(int i = 0 ; i< firstString.length() ;i++){
                //Increment the character count of first string
                    characterCount[firstString.charAt(i) - 'a']++;


                    //decrement the character count of second string
                    characterCount[secondString.charAt(i) - 'a']--;
        }

        for(int i = 0 ; i< characterCount.length ;i++){
        if(characterCount[i] != 0){
                return false;
        }
        }
        return true;
    }

    private static boolean isAnagramUsingMap(String firstString, String secondString) {

        if(firstString.length() != secondString.length()){
            return false;
        }


        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0 ; i < firstString.length() ;i ++){
            char firstCharacter = firstString.charAt(i);
            char secondCharacter = secondString.charAt(i);
            //Put in in the the first map with key (character in the string ) and increment the value
            hashMap.put(firstCharacter , hashMap.getOrDefault(firstCharacter , 0) + 1);

            //Put in in the the first map with key (character in the string ) and decrement the value
            hashMap.put(secondCharacter , hashMap.getOrDefault(secondCharacter , 0)- 1);
        }

        //Iterate through the the the map
        for(char c : hashMap.keySet()){

            //The resultant values should be 0 for the anagram or return false
            if(hashMap.get(c) != 0){
                return  false;

            }
        }

        //Valid anagram
        return true;
    }
}
