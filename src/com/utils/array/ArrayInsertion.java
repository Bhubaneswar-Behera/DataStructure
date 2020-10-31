package com.utils.array;


/**
 * Given a array ,insert an element into the array
 *
 *
 */
public class ArrayInsertion {
    public static void main(String[] args) {
        int inputArray[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printArray(inputArray);

        int[] updatedArray = insertAt(inputArray , 11, 3);
        System.out.println("\n");
        printArray(updatedArray);
        System.out.println("\n"+updatedArray.length);
    }


    private static int[] insertAt(int[] inputArray , int inputNumber, int position){
        int[] updateArray = new int[inputArray.length + 1];
        for(int i = 0 ; i < updateArray.length ; i++){
            if(i < position -1){
                updateArray[i] = inputArray[i];
            } else if(i == position - 1){
                updateArray[i] = inputNumber;
            } else {
                updateArray[i] = inputArray[i-1]; // as we have inserted the input number at postion -1
            }
        }
        return updateArray;

    }

    private static void printArray(int[] inputArray){
        for(int i = 0; i <= inputArray.length -1 ;i++){
            System.out.print(" "+inputArray[i]);
        }
    }

    private static void populateArray(int[] inputArray){
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 3;
        inputArray[3] = 4;
    }
}
