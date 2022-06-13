public class example1 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            // Throw exception
            throw new RuntimeException("Unchecked error");
        }
        catch (RuntimeException e) {
            System.out.println("1 "+e);
        }
        System.out.println("2");
    }
}

