package com.utils.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
 *
 *
 *
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 *
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 *
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 *
 */
public class SingleNumberPicker {
    public static void main(String[] args) {
        int[] inputArray = {2,2,1};
        System.out.println("Unique element in the list is : "+singleNumber(inputArray));
        System.out.println("Unique element in the list is : "+singleNumberUsingSet(inputArray));
    }

    private static  int singleNumber(int[] inputArray) {
        List<Integer> uniqueList = new ArrayList<>();

        for (int element : inputArray){
            if(!uniqueList.contains(element)) {
                uniqueList.add(element);
            } else {
                uniqueList.remove(new Integer(element));
            }
        }
        return uniqueList.get(0);
    }

    private static  int singleNumberUsingSet(int[] inputArray) {
        Set<Integer> hashSet = new HashSet<>();

        for(int element : inputArray){
            if(hashSet.contains(element)) {
                hashSet.remove(element);
            } else {
                hashSet.add(element);
            }
        }
        for(int element : hashSet){
            return element;
        }
        return -1;
    }
}
