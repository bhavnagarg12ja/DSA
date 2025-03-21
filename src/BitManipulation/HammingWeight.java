package BitManipulation;

public class HammingWeight {
    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1); // Removes the lowest set bit
            count++;
        }
        return count;
    }
    public static int hammingWeight2(int n) {
        return Integer.bitCount(n);
    }
    public static void main(String[] args) {
        int input1 = 11;
        System.out.println("Output 1: " + hammingWeight(input1));
        System.out.println("Output 2: " + hammingWeight2(input1));
    }
}
