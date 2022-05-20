import java.util.HashMap;

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
//        System.out.println(Integer.highestOneBit(15));
//        System.out.println(Integer.highestOneBit(16));
//        System.out.println(Integer.highestOneBit(17));
        int h = 323543646;
        int len = 16;
        System.out.println(h % len);
        System.out.println(h & (len - 1));
    }
}
