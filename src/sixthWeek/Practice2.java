package sixthWeek;

import java.util.HashMap;
import java.util.Map;

public class Practice2 {
    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'f', 'b', 'd', 'a', 'b' };

        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character c : map.keySet()) {
            sb.append(c + ": " + map.get(c) + ", ");
        }
        sb.delete(sb.length() - 2, sb.length() - 1);
        System.out.println(sb);
    }
}
