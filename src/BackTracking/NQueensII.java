package BackTracking;
import java.util.Arrays;
import java.util.List;

public class NQueensII {
    public static int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(char[] i:board){
            Arrays.fill(i,'.');
        }
        return dfs(board,0);
    }

    public static int dfs(char[][] board,int col){
        if(col == board.length){
            return 1;
        }
        int count = 0;
        for(int row = 0;row<board.length;row++){
            if(isSafe(board,row,col)){
                board[row][col] = 'Q';
                count += dfs(board,col+1);
                board[row][col] = '.';
            }
        }

        return count;
    }
    public static boolean isSafe(char[][] board,int row, int col){
        int dupRow = row;
        int dupCol = col;
        while(row >=0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row = dupRow;
        col = dupCol;
        while(col >= 0){
            if(board[row][col] == 'Q') return false;
            col--;
        }
        row = dupRow;
        col = dupCol;
        while(col >= 0 && row < board.length){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return true;
    }
    public static void main(String[] args){
        int n = 4;
        int result = totalNQueens(n);
        System.out.println(result);
    }
}
