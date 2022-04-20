import java.util.Scanner;
public class example34_01 {
    public static void main(String[] args) {
        Scanner inCmd = new Scanner(System.in);
        System.out.println("Input any string for a SuperClass to process it: ");
        SuperClass super1 = new SuperClass(inCmd.nextLine());
        String superText = super1.toString();
        System.out.println(superText);
        System.out.println("\nInput any string for a SubClass to process it: ");
        SubClass sub1 = new SubClass(inCmd.nextLine());
        String subText = sub1.toString();
        System.out.println(subText); 
        System.out.println("\nInput two strings for a SubClass to process it: ");
        SubClass sub2 = new SubClass(inCmd.nextLine(), inCmd.nextLine());
        subText = sub2.toString();
        System.out.println(subText); 
        inCmd.close();
    }
}
class SuperClass {
    private String text1;
    SuperClass(String x) {
        text1 = x;
    }
    public String toString() {
        String result;
        result = "You're inside a: " + this.getClass().getSimpleName() + "\n" + "Value of a string field: " + text1;
        return result;
    }
    public String text1Get() {
        return text1;
    }
}
class SubClass extends SuperClass {
    private String text2;
    SubClass(String x) {
        super(x);
    }
    SubClass(String x, String y) {
        super(x);
        text2 = y;
    }
    @Override
    public String toString() {
        String result;
        if (text2==null) result = "You're inside a: " + this.getClass().getSimpleName() + "\n" + "Value of a string field: " + text1Get();
        else result = "You're inside a: " + this.getClass().getSimpleName() + "\n" + "Value of two string fields: " + text1Get() + " " + text2;
        return result;
    }
}