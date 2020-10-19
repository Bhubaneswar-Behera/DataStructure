package com.utils.array;

/**
 * This class is used to rotate an array of size n by d elements  to the right.
 *
 */

public class RotateArray {
    public static void main(String[] args) {

        int[] inputArray = {1,2,3,4,5,6,7};
        System.out.print("Before rotation : ");
        printArray(inputArray);

        processArray(inputArray,2);

        System.out.println("\n");
        System.out.print("After rotation : ");
        printArray(inputArray);
    }
    private static void processArray (int[] inputArray , int numberOfShifting){
        //this is used for number of shift needed
        for(int i = 0 ; i < numberOfShifting ; i++){
            rotateRight(inputArray);
        }
    }

    private  static void rotateRight(int[] inputArray){
        int i , tempArray;

        //Assign the first element to a temporary
        tempArray = inputArray[0];

        //iterate through the input array
        for(i = 0 ; i < inputArray.length -1 ; i++){
            //Move and assign elements one position right
            inputArray[i] = inputArray [i+1];
        }

        //Shift the first element to last element
        inputArray[i] = tempArray;

    }
    private static  void printArray(int[] inputArray){
        for (int a : inputArray){
            System.out.print(" " +a);
        }
    }
}
