import java.util.InputMismatchException;
import java.util.Scanner;

public class example34_01 {
    static Scanner in = new Scanner(System.in);

    public static void average() throws RuntimeException {
        int n = in.nextInt();
        int[] array = new int[n];5
        double average = 0;
        if (n > 0) {
            double sum = 0;
            for (int i = 0; i < n; i++) {
                System.out.println("Input number array: ");
                array[i] = in.nextInt();
                sum += array[i];
                average = sum / array.length;
            }
            System.out.println(average);
        }
    }

    public static void main(String[] args) {
        try {
            System.out.print("Input array size: ");
            average();
        } catch (NumberFormatException e) {
            System.out.println("Несоответствие числового типа!" + e);
        } catch (InputMismatchException e) {
            System.out.println("Ввод строки вместо числа!" + e);
        } catch (RuntimeException e) {
            System.out.println("Положительные элементы отсутствуют!" + e);
        }
    }
}
