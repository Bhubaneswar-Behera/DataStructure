package com.utils.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 * Example  1:
 * Given nums = [3,2,2,3], val = 3,
 * Your function should return length = 2, with the first two elements of nums being 2.
 *
 * Example 2:
 *
 * Given nums = [0,1,2,2,3,0,4,2], val = 2,
 * Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
 *
 * Note that the order of those five elements can be arbitrary.
 *
 * It doesn't matter what values are set beyond the returned length.
 *
 *
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] inputArray = {3,2,2,3};
        int value = 2;
        List<Integer> outputList  = removeElement(inputArray, value);
        printList(outputList);

    }

    private static List<Integer> removeElement(int[] inputArray, int val) {
        List<Integer> outputList = new ArrayList();
        for(int i :  inputArray){
            if( i != val){
                outputList.add(i);
            }
        }
        return outputList;

    }

    private static void printList(List<Integer> inputList){
        inputList.forEach(data -> {
            System.out.print(" "+data);
        });
    }
}
