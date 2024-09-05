package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int n = 5;
        // Generate Pascal's Triangle with n rows
        List<List<Integer>> pascalTriangle = pascalTriangle(n);
        // Output the Pascal's Triangle
        for (List<Integer> row : pascalTriangle) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> pascalTriangle(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> row, col = null;
        for (int i = 0; i < numRows; i++) {
            row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(col.get(j - 1) + col.get(j));
                }
            }
            col = row;
            result.add(row);
        }
        return result;
    }
}