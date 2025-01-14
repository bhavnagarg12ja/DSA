package Arrays;

public class BuySellStockII {
    public static int maxProfit(int[] nums) {
        int totalProfit = 0;
        int profit = 0;
        int n = nums.length;
        for(int i = 1 ; i < n; i++){
            if(nums[i] > nums[i - 1]){
                profit = nums[i] - nums[i-1];
                totalProfit += profit;
            }
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(nums);
        System.out.println(result);
    }

}