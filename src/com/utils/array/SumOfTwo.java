package com.utils.array;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 */
public class SumOfTwo {
    public static void main(String[] args) {
        int[] inputNumberArray  = {2,5,5,11};
        int target = 10;

        int[] outputArray = twoSum(inputNumberArray,target);

        printArray(outputArray);

    }

    private static int[] twoSum(int[] inputNumberArray, int target) {

        for (int i = 0 ; i < inputNumberArray.length ; i++) {
            for (int j = i + 1 ; j < inputNumberArray.length ; j++) {
                if(inputNumberArray[i] + inputNumberArray[j] == target){
                    return  new int[] {i,j};
                }
            }
        }
        throw  new IllegalArgumentException("No value matched");
    }
    private static void printArray(int[] inputArray){
        for(int i : inputArray){
            System.out.println(" "+ i);
        }
    }
}
