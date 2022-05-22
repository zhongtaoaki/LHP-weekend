import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

/**
 * Map实现了映射的数据结构
 * key-value 键值对
 * 一个key 对应一个value
 * value的值是可以重复的
 * 但是key的值是不可以重复的
 * 键值对是没有顺序的
 * 所以key的底层是set
 * HashMap HashSet
 * TreeMap
 * Key和Value都得是引用数据类型
 * 
 */
public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "satou");
        map.put(2, "suzuki");
        map.put(3, "tanaka");

        // for (Integer key : map.keySet()) {
        // System.out.println(key + ": " + map.get(key));
        // }

        // System.out.println(map);

        // for (Entry<Integer, String> entry : map.entrySet()) {
        // System.out.println(entry.getKey()+": "+entry.getValue());
        // }

        // Set<Integer> keys = map.keySet();
        // Iterator iterator = keys.iterator();

        // while (iterator.hasNext()) {
        //     Integer i = (Integer) iterator.next();
        //     System.out.println(i + ": " + map.get(i));
        // }

        Set<Entry<Integer, String>> entries = map.entrySet();
        Iterator<Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Entry<Integer, String> i = (Entry<Integer, String>) iterator.next();
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }
}
