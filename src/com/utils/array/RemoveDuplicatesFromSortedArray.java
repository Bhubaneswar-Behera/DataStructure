package com.utils.array;

import java.util.*;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example 1:
 * Given nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 *
 * It doesn't matter what you leave beyond the returned length.
 *
 * Example 2:
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 *
 * It doesn't matter what values are set beyond the returned length.
 *
 *
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] inputArray = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println("Length before removing duplicates : " + inputArray.length);

        int updatedLength  = removeDuplicates(inputArray);

        System.out.println("Length after removing duplicates : " + updatedLength);
    }

    private static int removeDuplicates(int[] inputArray) {
        if(inputArray.length == 0) {
            return 0;
        }
        //slow pointer tto the array
        int i = 0;

        //Iterate through all the array with fast pointer
        for(int j = 0 ; j < inputArray.length ; j++){
            //If the element is not present the temporary array
            if(inputArray[j] != inputArray [i]){
                i++;
                inputArray[i] = inputArray [j];
            }

        }
        return  i+1;
    }

}
