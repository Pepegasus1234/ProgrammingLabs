public class example13 {
    public static void main(String[] args) {
        try {
            int l = args.length;
            System.out.println("Array size = " + 1);
            int h = 10 / 1;
            args[1 + 1] = "10";
        } catch (ArithmeticException e) {
            System.out.println("Division by 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is nonexistent");
        }
    }
}
