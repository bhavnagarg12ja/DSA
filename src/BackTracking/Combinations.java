package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        combination(result, inner, 1, n, k);
        return result;
    }

    public static void combination(List<List<Integer>> result, List<Integer> inner, int number, int n, int k) {
        if (k == inner.size()) {
            result.add(new ArrayList<>(inner));
            return;
        }
        for (int i = number; i <= n; i++) {
            inner.add(i);
            combination(result, inner, i + 1, n, k);
            inner.remove(inner.size() - 1);
        }
    }
    public static void main(String[] args){
        int n = 4;
        int k = 2;
        List<List<Integer>> result = combine(n , k);
        System.out.println(result);
    }
}
