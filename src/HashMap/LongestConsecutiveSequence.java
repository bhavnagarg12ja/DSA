package HashMap;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0;
        }
        Arrays.sort(nums);
        int maxCount = 1;
        int count = 1;
        int prev = nums[0];
        for(int i=1;i<n;i++){
            if(nums[i] == prev + 1){
                count++;
            }else if(nums[i] != prev){
                count = 1;
            }
            prev = nums[i];
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }

    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        int result = longestConsecutive(nums);
        System.out.println(result);
    }
}
