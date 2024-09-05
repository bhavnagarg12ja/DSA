package Sorting;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};
        int n = arr.length;
        System.out.println("Before Sorting Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Function call to sort the array using quick sort
        int[] sortedArr = mergeSorted(arr, 0, n - 1);

        System.out.println("After Sorting Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        System.out.println();
    }

    //divides the array into two parts
    public static int [] mergeSorted(int[] arr, int low, int high){
        if(low >= high){
            return arr;
        }
        int mid = (low + high) / 2;
        mergeSorted(arr, low, mid);
        mergeSorted(arr, mid + 1, high);
        merge(arr, low, mid, high);
        return arr;
    }
    //merges the two halves of the array
    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        //Adding the left remaining elements
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        //Adding the right remaining elements
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        //transfering the elements back to array
        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }
}
