package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {
    private static final String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        letterCombinations(digits, ans, 0, "");
        return ans;
    }

    public static void letterCombinations(String digits, List<String> ans, int ind, String curr){
        if(ind == digits.length()){
            ans.add(curr);
            return;
        }
        String s = map[digits.charAt(ind) - '0'];
        for(int i = 0; i < s.length(); i++){
            letterCombinations(digits, ans, ind+1, curr + s.charAt(i));
        }
    }

    public static void main(String[] args){
        List<String> result = letterCombinations("23");
        System.out.println(result);
    }
}
