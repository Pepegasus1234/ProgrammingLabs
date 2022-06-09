// Recursion //
import java.util.Scanner;
public class example34_01 {
    private static int step = 0;
    public static void main(String[] args) {
        Scanner inCmd = new Scanner(System.in);
        System.out.println("Lets define an x parameter: ");
        int x = inCmd.nextInt();
        System.out.println("So the output of the first example is: ");
        firstExample(x);
        System.out.println("\nFor the second example do you want to use previous variable? Type 'y' if yes, and 'n' for redefining it >>");
        char choice = inCmd.next().charAt(0);
        if (choice == 'n') {
            System.out.println("Type a new value for x");
            x = inCmd.nextInt();
        }
        System.out.println("Output of second example is:");
        secondExample(x);

        System.out.println("\nStill want to use this x value? ");
        choice = inCmd.next().charAt(0);
        if (choice == 'n') {
            System.out.println("Type a new value for x");
            x = inCmd.nextInt();
        }
        System.out.println("\nOutput of third example is:");
        thirdExample(x);

        System.out.println("Now let's calculate factorial of a random number through recursion. Type any number below");
        System.out.println("Factorial is equal to: "+fourthExample(inCmd.nextInt()));

        System.out.println("At last. Let's enter a fibbonaci number index to check out which value is there, under that index");
        int fib = inCmd.nextInt();
        System.out.printf("There is a value of %d, under index %d", fifthExample(fib), fib);
        inCmd.close();
    }

    static void firstExample(int x) {
        System.out.print(x+" ");
        if ((2*x+1) < 20) {
            firstExample(2*x+1);
        }
    }
    static void secondExample(int x) {
        if ((2*x+1) < 20) {
            secondExample(2*x+1);
        }
        System.out.print(x+" ");
    }
    static void thirdExample(int x) {
        space();
        System.out.println(x+" -> ");
        step++;
        if((2*x+1)<20) {
            thirdExample(2*x+1);
        }
        step--;
        space();
        System.out.println(x+" <-");
    }
    static void space() {
        for (int i=0; i<step; i++) {
            System.out.print(" ");
        }
    }
    static int fourthExample(int x) {
        int result;
        if (x==1) return x;
        result = fourthExample(x-1)*x;
        return result;
    }

    static int fifthExample(int x) {
        if (x==0) return x;
        else if (x==1) return x;
        return fifthExample(x-2)+fifthExample(x-1);
    }
}