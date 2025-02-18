package HashMap;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if (charMap.containsKey(sc)) {
                if (charMap.get(sc) != tc) {
                    return false;
                }
            } else if (charMap.containsValue(tc)) {
                return false;
            }
            charMap.put(sc, tc);
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        boolean result = isIsomorphic(s, t);
        System.out.println(result);
    }
}
