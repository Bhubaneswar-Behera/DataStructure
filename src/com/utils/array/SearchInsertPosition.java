package com.utils.array;


/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 *
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 *
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 * Example 4:
 * Input: nums = [1,3,5,6], target = 0
 * Output: 0
 *
 * Example 5:
 * Input: nums = [1], target = 0
 * Output: 0
 *
 *
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] inputArray = {1,3,5,6};
        int target = 5 ;

        int result = searchInsert(inputArray,target);
        System.out.println("result : "+ result);
    }

    private static int searchInsert(int[] inputArray, int target) {
        int i = 0;
        int j = inputArray.length - 1;

        while ( i < j ){
            int mid = i + j / 2;

            if (target > inputArray[mid]){
                i = mid + 1;
            } else if (target < inputArray[mid]){
                j = mid - 1;
            } else{
                return mid;
            }

        }
        return i;
    }
}
