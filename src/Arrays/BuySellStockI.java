package Arrays;

public class BuySellStockI {
    public static int maxProfit(int[] nums) {
        int maxProfit = 0;
        int profit = 0;
        int n = nums.length;
        int curr = nums[0];
        for(int i = 1 ; i < n; i++){
            if(curr > nums[i]){
                curr = nums[i];
            }else{
                profit = nums[i] - curr;
            }
            maxProfit = Math.max(profit, maxProfit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(nums);
        System.out.println(result);
    }

}
