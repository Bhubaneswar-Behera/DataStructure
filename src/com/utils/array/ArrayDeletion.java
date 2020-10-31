package com.utils.array;



import java.util.Arrays;


/**
 * Given a array ,delete an element from a specific position
 */
public class ArrayDeletion {
    public static void main(String[] args) {
        int inputArray[] = { 1, 2, 3, 4, 5,6,7,8,9,10 };
        System.out.println(Arrays.toString(inputArray) + "\n" + "Size is :"+inputArray.length);


        int[] updateArray = remove(inputArray , 3);
        System.out.println("\n");
        System.out.println("After removing" + "\n" + Arrays.toString(updateArray) + "\n" + "Size is :"+updateArray.length);

    }

    private static int[] remove (int[] inputArray , int index) {

        int[] updateArray = new int[inputArray.length -1];

            for(int i = 0 ; i < inputArray.length -1 ; i++) {
                if (i < index - 1) {
                    updateArray[i] = inputArray[i];
                } else if(i == index - 1){
                   updateArray[i] = inputArray [i+1];
                } else {
                    updateArray[i] = inputArray[i+1];
               }

            }
            return updateArray;
}


    private static int size(int[] inputArray) {
        return inputArray.length;
    }


}
