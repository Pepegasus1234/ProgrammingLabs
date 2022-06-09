import java.util.Scanner;

public class example34_02 {
    public static void main(String args[]) {
        Scanner inCmd = new Scanner(System.in);
        System.out.println("Lets enter a random decimal number to convert it to binary: ");
        int num = inCmd.nextInt();
        System.out.println("Previously entered number in decimal is equal to: "+ recBin(num) + " in binary");
        inCmd.close();
    }    
    static int recBin(int x){
        if (x == 0) return 0;
        return x % 2 + 10 * recBin(x/2); 
    }
}
