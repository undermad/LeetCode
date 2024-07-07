import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInTheString {
    public static void main(String[] args) {


    }

    public static int firstUniqChar(String s) {
        Map<Character, Integer> counter = new HashMap<>();


        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            boolean exist = counter.containsKey(chars[i]);
            if(exist) counter.computeIfPresent(chars[i], (key, oldValue) -> oldValue + 1);
            else counter.put(chars[i], 1);
        }
        
        
        
    }

}
