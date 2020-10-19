package com.utils.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * Example 1:
 * Input: [1,2,3,1]
 * Output: true
 *
 * Example 2:
 * Input: [1,2,3,4]
 * Output: false
 *
 * Example 3:
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 */
public class DuplicateChecker {
    public static void main(String[] args) {
        int[] inputArray = {1,2,3,1};

        System.out.println("Duplicate values present in the given array : " + containsDuplicate(inputArray));
        System.out.println("Duplicate values present in the given array : " + containsDuplicateUsingHashSet(inputArray));
    }

    /**
     * Using normal for loop
     *
     * Time Complexity  : O ( n 2)
     *
     * @param inputArray
     * @return
     */
    private static boolean containsDuplicate(int[] inputArray) {
        for (int i = 0; i < inputArray.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (inputArray[j] == inputArray[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Usinh HashSet
     *
     * Time Complexity  : O ( n )
     *
     * @param inputArray
     * @return
     */
    private static boolean containsDuplicateUsingHashSet(int[] inputArray) {
        Set<Integer> hashSet = new HashSet<>();

        for(int element : inputArray) {
            //If
            if(hashSet.contains(element)){
                return true;
            }
            hashSet.add(element);
        }

        return false;
    }
}
