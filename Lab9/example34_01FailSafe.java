import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class example34_01FailSafe {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("Let's", 1);
        map.put("Test", 2);
        map.put("It", 3);

        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key+" - "+map.get(key));
            // Здесь код итератора закончит работу //
            map.put("Four", 4);
        }
    }
}
