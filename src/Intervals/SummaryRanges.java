package Intervals;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        int n = nums.length;
        List<String> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int num = nums[i];
            while(i < n - 1 && nums[i] + 1 == nums[i + 1]){
                i++;
            }
            if(num != nums[i]){
                res.add(num + "->" + nums[i]);
            }else{
                res.add(String.valueOf(num));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        List<String> result = summaryRanges(nums);
        System.out.println(result);
    }
}
