import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class example34_02 {
    static Scanner in = new Scanner(System.in);
    static Random random = new Random();
    public static void matrix(int columns, int rows) throws RuntimeException {

        int[][] matrix = new int[columns][rows];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                matrix[i][j] = random.nextInt(10);
                System.out.printf("%4d\t", matrix[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println(i + "\nСтолбец: " + j + "\nНомер: " + matrix[i][j]); //i - ряд
            }
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Input array columns and rows: ");
            matrix(in.nextInt(), in.nextInt());
    } catch (InputMismatchException e) {
        System.out.println("You inputted a string instead of number!" + e);
    } catch (NegativeArraySizeException e) {
        System.out.println("There is no such collumn" + e);
    } finally {
        System.out.println("You done everything right!");
    }
    }
}
