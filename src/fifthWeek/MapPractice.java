package fifthWeek;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapPractice {
    public static void main(String[] args) {

        String s = "Hello World";

        s = s.toLowerCase();
        char[] chars = s.toCharArray();

        Map<Character, Integer> map = new HashMap();

        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);

    }
}
