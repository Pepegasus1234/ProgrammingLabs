import java.util.*;

public class example34_01RunTime {
    public static void main(String[] args) {
        // 3 млн элементов - 3 вариант// 
        List<Integer> arrayList = new ArrayList<> ();
        List<Integer> linkedList = new LinkedList();
        System.out.println("Lets fill the arrayList");
        arrayList = getRunningTimeFill(arrayList);
        System.out.println("Time that is taken to add element in the start of the arrayList is equal to: "+getRunningTimeGetStart(arrayList));
        System.out.println("Time that is taken to add element in the middle of the arrayList is equal to: "+getRunningTimeGetMiddle(arrayList));
        System.out.println("Time that is taken to add element in the end of the arrayList is equal to: "+ getRunningTimeGetEnd(arrayList));

        System.out.println("Lets fill the linkedList");
        linkedList = getRunningTimeFill(linkedList);
        System.out.println("Time that is taken to add element in the start of the linkedList is equal to: "+getRunningTimeGetStart(linkedList));
        System.out.println("Time that is taken to add element in the middle of the linkedList is equal to: "+getRunningTimeGetMiddle(linkedList));
        System.out.println("Time that is taken to add element in the end of the linkedList is equal to: "+ getRunningTimeGetEnd(linkedList));
        
        System.out.println("Lets delete elements from arrayList");
        System.out.println("Time that is taken to delete element in the start of the arrayList is equal to: "+getRunningTimeGetStart(arrayList));
        System.out.println("Time that is taken to delete element in the middle of the arrayList is equal to: "+getRunningTimeGetMiddle(arrayList));
        System.out.println("Time that is taken to delete element in the end of the arrayList is equal to: "+ getRunningTimeGetEnd(arrayList));
        System.out.println("Lets delete all the elements from the list, the time it took to do it is equal to: " + getRunningTimeDeleteAll(arrayList));

        System.out.println("Lets delete elements from linkedList");
        System.out.println("Time that is taken to delete element in the start of the linkedList is equal to: "+getRunningTimeGetStart(linkedList));
        System.out.println("Time that is taken to delete element in the middle of the linkedList is equal to: "+getRunningTimeGetMiddle(linkedList));
        System.out.println("Time that is taken to delete element in the end of the linkedList is equal to: "+ getRunningTimeGetEnd(linkedList));
        System.out.println("Lets delete all the elements from the list, the time it took to do it is equal to: " + getRunningTimeDeleteAll(linkedList));
    }
    // Время заполнения списка от 0 до 3 млн //
    private static List getRunningTimeFill(List <Integer> list) {
        long start = System.currentTimeMillis();
        for (int i=0; i<3000000;i++) {
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time of comletion of filling the list Collection: "+ (end-start));
        return list; 
    }
    // Время добавления элемента в начале списка //
    private static long getRunningTimeGetStart(List <Integer> list) {
        long start = System.currentTimeMillis();
        list.add(0, 11);;
        long end = System.currentTimeMillis();
        return end-start;
    }
    // Время добавления элемента в середине списка //
    private static long getRunningTimeGetMiddle(List <Integer> list) {
        long start = System.currentTimeMillis();
        list.add(1500000, 1500);
        long end = System.currentTimeMillis();
        return end-start;
    }
    // Время добавления элемента в конце списка //
    private static long getRunningTimeGetEnd(List <Integer> list) {
        long start = System.currentTimeMillis();
        list.add(2999999, 2999);
        long end = System.currentTimeMillis();
        return end-start;
    }
    // Время удаления элемента в начале списка //
    private static long getRunningTimeDeleteStart(List <Integer> list) {
        long start = System.currentTimeMillis();
        list.remove(0);
        long end = System.currentTimeMillis();
        return end-start;
    }
    // Время удаления элемента в середине списка //
    private static long getRunningTimeDeleteMiddle(List <Integer> list) {
        long start = System.currentTimeMillis();
        list.remove(1500000);
        long end = System.currentTimeMillis();
        return end-start;
    }
    // Время добавления элемента в конце списка //
    private static long getRunningTimeDeleteEnd(List <Integer> list) {
        long start = System.currentTimeMillis();
        list.remove(2999999);
        long end = System.currentTimeMillis();
        return end-start;
    }
    // Время удаления всего списка //
    private static long getRunningTimeDeleteAll(List <Integer> list) {
        long start = System.currentTimeMillis();
        list.remove(list);
        long end = System.currentTimeMillis();
        return end-start;
    }
}
