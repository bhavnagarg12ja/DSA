package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {13, 46, 24, 52, 20, 9};
        System.out.println("Before Using Insertion Sort: " + Arrays.toString(nums));
        // Function call for insertion sort
        nums = insertionSort(nums);
        System.out.println("After Using Insertion Sort: " + Arrays.toString(nums));
    }
    public static int[] insertionSort(int[] nums) {
        int n = nums.length;
        for(int i = 1; i < n; i++){
            int key = nums[i];
            int j = i-1;
            // Swap elements till we reach greater element
            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
    }
}
