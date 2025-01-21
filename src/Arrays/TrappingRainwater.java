package Arrays;

public class TrappingRainwater {
    public static int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        while(left < right){
            if(height[left] < height[right]){
                if(leftMax > height[left]){
                    total += leftMax - height[left];
                }else{
                    leftMax = height[left];
                }
                left++;
            }else{
                if(rightMax > height[right]){
                    total += rightMax - height[right];
                }else{
                    rightMax = height[right];
                }
                right--;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        int result = trap(nums);
        System.out.println(result);
    }
}
