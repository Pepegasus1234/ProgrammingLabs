import java.util.InputMismatchException;
import java.util.Scanner;

public class example34_03 {
    static Scanner in = new Scanner(System.in);

    public static void byteType() throws Exception {
        byte n = in.nextByte();
        byte[] array = new byte[n];
        byte sum = 0;

        for (byte i = 0; i < n; i++) {
            System.out.print("Input number array: ");
            array[i] = in.nextByte();
            sum += array[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        try {
            System.out.print("Input size array: ");
            byteType();
        } catch (InputMismatchException e) {
            System.out.println("You inputted string instead of number" + e);
        } catch (Exception e) {
            System.out.println("You inputted or calculated a number out of diapason boundaries" + e);
        } finally {
            System.out.println("You done everything right");
        }
    }
}
