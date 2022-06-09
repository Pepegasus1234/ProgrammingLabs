import java.util.Scanner;

public class example34_03 {
    static Scanner inCmd = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Let's enter the size of an array");
        int array[] = new int[inCmd.nextInt()];
        int filledArr[] = fillArray(array, 0);
        System.out.println("Now let's write out elements of an array");
        outArray(filledArr, filledArr.length-1);
        inCmd.close();
    }
    public static int[] fillArray(int[] arr, int index) {
        if (index < arr.length) {
            System.out.printf("Enter the %d element of an array: ", index);
            arr[index] = inCmd.nextInt();
            fillArray(arr, index+1);
        }
        return arr;
    }
    public static void outArray(int[] arr, int index) {
        if (index >= 0) {
            outArray(arr, index-1);
            System.out.printf("Element from an array under %d index is equal to: %d \n", index, arr[index]);
        }
    }
}
