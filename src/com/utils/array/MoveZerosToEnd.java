package com.utils.array;


import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of random numbers, Push all the zero’s of a given array to the end of the array
 * while maintaining the relative order of the non-zero elements.
 *
 * For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
 * it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
 * The order of all other elements should be same.
 *
 *
 * Example:
 *
 * Input :  arr[] = {1, 2, 0, 4, 3, 0, 5, 0};
 * Output : arr[] = {1, 2, 4, 3, 5, 0, 0};
 *
 * Input : arr[]  = {1, 2, 0, 0, 0, 3, 6};
 * Output : arr[] = {1, 2, 3, 6, 0, 0, 0};
 *
 */
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println("Before shifting zeros");
        printArray(inputArray);
        moveZeroes(inputArray);
        System.out.print("\n After shifting zeros \n");
        printArray(inputArray);
    }

    private static void moveZeroes(int[] inputArray) {
        int index = 0;
        for(int i = 0 ; i < inputArray.length ; i++){
            if(inputArray[i] != 0){
               inputArray[index++] = inputArray[i];
            }
        }

        //Fill the rest of the elements with 0
        for(int i = index ; i < inputArray.length ; i++){
            inputArray[i] = 0;
        }

    }

    private static void printArray(int[] inputArray){
        for (int i : inputArray) {
            System.out.print(" "+ i);
        }
    }
}
