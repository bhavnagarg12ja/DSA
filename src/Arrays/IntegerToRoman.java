package Arrays;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int[] key = {1000, 900, 500, 400, 100, 90, 50,
                40, 10, 9, 5, 4, 1};
        String[] value = {"M", "CM", "D", "CD", "C", "XC", "L",
                "XL", "X", "IX", "V", "IV", "I"};
        for(int i = 0; i < key.length;){
            if(num >= key[i]){
                result.append(value[i]);
                num -= key[i];
            }else{
                i++;
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        int num = 3749;
        String result = intToRoman(num);
        System.out.println(result);
    }
}
