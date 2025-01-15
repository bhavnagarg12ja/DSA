package Arrays;

public class JumpGame {

    public static boolean canJump(int[] nums) {
        int canJump = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > canJump){
                return false;
            }
            canJump = Math.max(canJump, i + nums[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,0};
        boolean result = canJump(nums);
        System.out.println(result);
    }
}
