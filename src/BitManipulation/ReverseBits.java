package BitManipulation;

public class ReverseBits {
    // Function to reverse bits of a 32-bit unsigned integer
    public static int reverseBits(int n) {
        int result = 0;
        // Iterate through all 32 bits
        for (int i = 0; i < 32; i++) {
            // Extract the last bit of 'n' (n & 1)
            int lastBit = n & 1;
            // Left shift the result to make space for the new bit
            result = (result << 1) | lastBit;
            // Right shift 'n' to process the next bit
            n >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int input1 = 0b00000010100101000001111010011100;
        System.out.println("Output 1: " + reverseBits(input1));  // Output: 964176192
    }
}

//<< (Left Shift) is like multiplying by 2.
//>> (Right Shift) is like dividing by 2 (preserving sign).
//>>> (Logical Right Shift) fills left bits with 0 (useful for unsigned numbers).