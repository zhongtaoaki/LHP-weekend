import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "satou");
        map.put(2, "suzuki");
        map.put(3, "tanaka");

        Set<Integer> keys = map.keySet();

        for (Integer key : keys) {
            System.out.println(map.get(key));
        }


        // China: Beijing
        // Japan: Tokyo
        // USA: Washington DC
        // UK: London
        

    }
}
