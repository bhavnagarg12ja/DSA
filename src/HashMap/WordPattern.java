package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] str = s.split(" ");
        if(str.length != pattern.length()){
            return false;
        }
        for(int i = 0; i < pattern.length(); i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!Objects.equals(map.get(pattern.charAt(i)), str[i])){
                    return false;
                }
            }else if(map.containsValue(str[i])){
                return false;
            }
            map.put(pattern.charAt(i), str[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        boolean result = wordPattern(pattern, s);
        System.out.println(result);
    }
}
