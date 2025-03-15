package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(n,res,"",0,0);
        return res;
    }

    public static void dfs(int n, List<String> ans,String comb,int left,int right){
        if(n * 2 == comb.length()){
            ans.add(comb);
            return;
        }
        if(left < n){
            dfs(n,ans,comb + "(",left+1,right);
        }
        if(right < left){
            dfs(n,ans,comb + ")",left,right+1);
        }
    }
    public static void main(String[] args){
        int n = 3;
        List<String> result = generateParenthesis(n);
        System.out.println(result);
    }
}
