import java.util.Scanner;

public class example34_05 {
    public static void main(String[] args) {
        Scanner inCmd = new Scanner(System.in);
        System.out.println("Select which method you want to use, to construct a linear list; \n type 'h' for method from head, or 't' for method that goes from tail");
        char choice = inCmd.nextLine().charAt(0);
        Node head, tail, ref;
        switch (choice) {
            case 'h':
                head = new Node(0, null);
                tail=head;
                for (int i = 0; i<9; i++) {
                    tail.next = new Node(i+1, null);
                    tail = tail.next;
                }
                ref = head;
                while (ref!=null) {
                    System.out.println(" "+ref.value);
                    ref = ref.next;
                }
                break;
                
            case 't':
                head = null;
                for (int i=9; i>=0; i--) {
                    head = new Node(i, head);
                }
                ref = head;
                while (ref!=null) {
                    System.out.println(" "+ref.value);
                    ref = ref.next;
                }
                break;

            default:
                System.out.println("Seems like you didnt specify your choice");
                break;
        }
        inCmd.close();
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