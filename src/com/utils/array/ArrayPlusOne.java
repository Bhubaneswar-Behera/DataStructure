package com.utils.array;


/**
 * Given a non-empty array of digits representing a non-negative integer,
 * increment one to the integer.
 *
 * The digits are stored such that the most significant digit is at the head of the list,
 * and each element in the array contains a single digit.
 *
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 *
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 *
 * Example 3:
 * Input: digits = [0]
 * Output: [1]
 *
 *
 */
public class ArrayPlusOne {
    public static void main(String[] args) {
    int[] inputArray = {9,9};

    int[] resultArray = plusOne(inputArray);
    printArray(resultArray);

    }

    public static int[] plusOne(int[] inputArray) {
        for(int i = inputArray.length -1 ; i >= 0 ; i--){
            if(inputArray[i] < 9){
                inputArray[i]++;
                return inputArray;
            }
            inputArray[i] = 0;
        }
        //If the code reaches here that means its for the 9 sceanrio
        int[] result = new int[inputArray.length + 1];
        result[0] = 1;
        return result;
    }

    private static  void printArray(int[] inputArray){
        for (int a : inputArray){
            System.out.print(" " +a);
        }
    }
}
