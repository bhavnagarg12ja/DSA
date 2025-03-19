package BinarySearch;
import java.util.Arrays;

public class FirstAndLastElement {
    public static int[] searchRange(int[] nums, int target) {
        int left = binarySearch(true, nums, target);
        int right = binarySearch(false, nums, target);
        return new int[] { left, right };
    }
    public static int binarySearch(boolean searchForLeft, int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        int index = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] > target){
                right = mid - 1;
            }else if (nums[mid] < target){
                left = mid + 1;
            }else{
                index = mid;
                if(searchForLeft){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,8,10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
