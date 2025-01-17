package Arrays;
import java.util.Arrays;

public class HIndex {
    public static int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                return n - i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {3,0,1,5,6};
        int result = hIndex(nums);
        System.out.println(result);
    }

    // approach - 2 (Binary Search)
    public int hIndex1(int[] citations) {
        int n = citations.length;
        int low = 1, high = n;
        int mid;
        int ans = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (isHIndex(citations, mid)) {
                low = mid + 1;
                ans = mid;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean isHIndex(int[] citations, int h) {
        int n = citations.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (citations[i] >= h) {
                count++;
            }
        }
        return count >= h;
    }

}
