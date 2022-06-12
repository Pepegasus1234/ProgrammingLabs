import java.util.LinkedHashSet;
import java.util.HashSet;
public class example34_01LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet();
      
        // Добавляем элементы к хэш-набору
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        System.out.println("Linked HS looks like this:");
        System.out.println(hs);

      // Создаём HashSet
      HashSet hs1 = new HashSet();
      
      // Добавляем элементы к HashSet
      hs1.add("B");
      hs1.add("A");
      hs1.add("D");
      hs1.add("E");
      hs1.add("C");
      hs1.add("F");
      System.out.println("HS looks like this:");
      System.out.println(hs1);
    }
}
