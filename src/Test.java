import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xzp
 * @date 2022.05.17 19:10
 */
public class Test {

    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("a","b");
        System.out.println(map.get("a"));
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue("b"));
        System.out.println();
        map.putAll(new HashMap<>());
        map.remove("a");
        System.out.println(map);
        System.out.println(Integer.highestOneBit(15));
        System.out.println(Integer.highestOneBit(16));
        System.out.println(Integer.highestOneBit(17));
        int h = 323543646;
        int len = 16;
        System.out.println(h % len);
        System.out.println(h & (len - 1));

        System.out.println("===============");

        ConcurrentHashMap<Object, Object> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("a","b");
        concurrentHashMap.putIfAbsent("b","c");
        concurrentHashMap.putAll(new HashMap<>());
        System.out.println(concurrentHashMap.get("a"));
        System.out.println(concurrentHashMap.put("a","c"));
        System.out.println(concurrentHashMap);

        System.out.println(concurrentHashMap.remove("a"));
        System.out.println(concurrentHashMap.remove("b","c"));

        System.out.println(concurrentHashMap.replace("a","dfg"));
        System.out.println(concurrentHashMap.replace("a","dfg","dghh"));
        concurrentHashMap.size();
        concurrentHashMap.clear();
    }
}
