package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutation(ans,nums,0);
        return ans;
    }

    public static void permutation(List<List<Integer>> ans,int[] nums,int index){
        if(index == nums.length){
            List<Integer> permute = new ArrayList<>();
            for(int num:nums){
                permute.add(num);
            }
            ans.add(new ArrayList<>(permute));
            return;
        }

        for(int i=index;i<nums.length;i++){
            swap(i,nums,index);
            permutation(ans,nums,index+1);
            swap(i,nums,index);
        }
    }

    public static void swap(int i,int[] nums,int index){
        int temp  = nums[index];
        nums[index] = nums[i];
        nums[i] = temp;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3};
        List<List<Integer>> result = permute(nums);
        System.out.println(result);
    }
}
