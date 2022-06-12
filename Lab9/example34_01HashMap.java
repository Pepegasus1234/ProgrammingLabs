import java.util.HashMap;
public class example34_01HashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> random = new HashMap<>();
        random.put("Shrek", 100);
        random.put("Shrek 2", 200);
        random.put("Shrek 3", 300);
        System.out.println("Elements in hashMap - random:");
        System.out.println(random);
        HashMap<String, Integer> rand = new HashMap<>();
        rand.put("Simpsons", 400);
        rand.put("Futurama", 500);
        System.out.println("Elements in hashMap - rand:");
        System.out.println(rand);
        random.putAll(rand);
        System.out.println("Elements in random map, after putAll method");
        System.out.println(random);
    }    
}
