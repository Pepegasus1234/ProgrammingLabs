import java.util.ArrayList;
import java.util.Iterator;

public class example34_01FailFast {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3125);
        list.add(123214515);
        list.add(7358745);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer integer = (Integer) it.next();
            //Это вызовет исключение //
            list.add(8123);
        }
    }    
}
