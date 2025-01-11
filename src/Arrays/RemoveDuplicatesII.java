package Arrays;

public class RemoveDuplicatesII {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,1,2,3,3};
        int result = removeDuplicatesII(nums);
        System.out.println(result);
    }
    public static int removeDuplicatesII(int[] nums) {
        int n = nums.length;
        int j = 2;
        for(int i = 2; i < n; i++){
            if(nums[i] != nums[j - 2]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
