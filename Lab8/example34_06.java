import java.util.Scanner;
import java.lang.StringBuilder;

public class example34_06 {
    public static void main(String[] args) {
        Scanner inCmd = new Scanner(System.in);
        System.out.println("Select the size of an linear list you want to manipulate on");
        int size = inCmd.nextInt();
        System.out.println("Select which method of adding element you want to test, type 'h' for filling a list from head, or 't' for filling a list from tail");
        char choice = inCmd.next().charAt(0);
        Node[] arrKeep = new Node[size]; // массив для помещения элементов списка созданных с помощью метода create //
        if (choice == 'h') {
            for (int i=0; i<size; i++) {
                arrKeep[i] = createHead(i);
            }
        }
        else if (choice == 't') {
            for (int i=size; i>=0; i--) {
                arrKeep = createTail(i, size);
            }
        }
        else {
            System.out.println("Seems like you typed an incorrect symbol, try again");
        }
        if (arrKeep.length != 0) {
            System.out.println("Let's convert our linear list to an array");
            System.out.println(toStringList(arrKeep));
        }
        inCmd.close();
    }
    static Node createHead (int index) {
        Node head = new Node(index, null);
        head.next = new Node(index+1, null);
        return head;
    }
    static Node[] createTail (int index, int size) {
        Node arr[] = new Node[size];
        Node head = null;
        for (int i=size-1; i>=0; i--) {
            head = new Node(i, head);
            arr[i] = head; 
        }
        return arr;
    }
    static String toStringList (Node arr[]) {
        StringBuilder sbf = new StringBuilder();
        for (int i=0; i<arr.length; i++) {
            sbf.append(arr[i].value);
            if (i==arr.length-1) break;
            sbf.append(", ");
        }
        String resultString = ("The resulting string of an ordered list is looking like this - " + sbf);
        return resultString;
    } 
}
class Node {
    public int value;
    public Node next;

    Node (int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
