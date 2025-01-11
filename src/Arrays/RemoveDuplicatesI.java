package Arrays;

public class RemoveDuplicatesI {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicatesI(nums);
        System.out.println(result);
    }
    public static int removeDuplicatesI(int[] nums) {
        int n = nums.length;
        int i = 1;
        int j = 1;
        while(i < n){
            if(nums[i]==nums[i-1]){
                i++;
            }else{
                nums[j] = nums[i];
                j++;
                i++;
            }
        }
        return j;
    }
}
