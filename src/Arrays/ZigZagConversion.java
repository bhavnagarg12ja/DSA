package Arrays;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length()){
            return s;
        }
        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            rows[i] = new StringBuilder();
        }
        int currRow = 0;
        boolean down = true;

        for(char c : s.toCharArray()){
            rows[currRow].append(c);
            if(currRow == 0){
                down = true;
            }else if(currRow == numRows - 1){
                down = false;
            }
            currRow += down ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String result = convert(s, numRows);
        System.out.println(result);
    }
}
