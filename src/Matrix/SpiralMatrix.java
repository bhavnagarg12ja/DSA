package Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        while(top <= bottom && left <= right){
            //top row
            for(int i = left; i <= right; i++){
                res.add(matrix[top][i]);
            }
            top++;

            //right column
            for(int i = top; i <= bottom; i++){
                res.add(matrix[i][right]);
            }
            right--;

            //bottom row
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            //left column
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> result = spiralOrder(matrix);
        System.out.println(result);
    }

}
