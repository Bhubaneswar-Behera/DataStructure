package com.utils.array;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 *
 * Example 2:
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 *
 * Note:
 *
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 *
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such
 * that you cannot load all elements into the memory at once?
 *
 *
 *
 */
public class IntersectionTwoArrays {
    public static void main(String[] args) {
      int[] firstArray = {1,2,2,1};
      int[] secondArray = {2,2};

      int[] resultArray = intersect(firstArray,secondArray);

      System.out.println("Intersection of the two arrays are as below");
      printArray(resultArray);
    }

    private static int[] intersect(int[] firstArray, int[] secondArray) {
        Map<Integer,Integer> firstHashMap = new HashMap();
        int indexFirstMapIndex = 0;
        //Put the first array in a HashMap
        for(int element : firstArray){
            firstHashMap.put(indexFirstMapIndex++,element);
        }

        //Create a second HashMap from the second array
        Map<Integer,Integer> secondHashMap = new HashMap();
        int indexSecondtMapIndex = 0;
        for(int intersectElement : secondArray){
            //if first set contains the elements of the second set
            if(firstHashMap.containsValue(intersectElement)){
                secondHashMap.put(indexSecondtMapIndex++,intersectElement);
            }
        }

        //Convert the resulting HashMap to int array
        int[] resultArray = new int[secondHashMap.size()];
        int indexOfResultArray = 0;
        secondHashMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : secondHashMap.entrySet()) {
            resultArray[indexOfResultArray++] = entry.getValue();
        }
        return resultArray;
    }

    private static  void printArray(int[] inputArray){
        for (int a : inputArray){
            System.out.print(" " +a);
        }
    }
}
