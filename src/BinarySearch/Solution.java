package BinarySearch;
import java.util.*;

class Solution {
    /*Function to count the number of
    students required given the maximum
    pages each student can read*/
    private int countStudents(int[] nums, int pages) {
        // Size of array
        int n = nums.length;
        int students = 1;
        int pagesStudent = 0;

        for (int i = 0; i < n; i++) {
            if (pagesStudent + nums[i] <= pages) {
                // Add pages to current student
                pagesStudent += nums[i];
            } else {
                // Add pages to next student
                students++;
                pagesStudent = nums[i];
            }
        }
        return students;
    }

    /* Function to allocate the book to ‘m’
    students such that the maximum number
    of pages assigned to a student is minimum*/
    public int findPages(int[] nums, int m) {
        int n = nums.length;

        // Book allocation impossible
        if (m > n) return -1;

        // Calculate the range for search
        int low = Integer.MIN_VALUE;
        int high = 0;
        for(int i = 0; i < n; i++){
            low = Math.max(low, nums[i]);
            high = high + nums[i];
        }
        while(low<=high){
            int mid = low + (high-low)/2;
            int students = countStudents(nums,mid);
            if(students > m){
                low =  mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int m = 2;

        // Create an instance of the Solution class
        Solution sol = new Solution();

        int ans = sol.findPages(arr, m);

        // Output the result
        System.out.println("The answer is: " + ans);
    }
}
