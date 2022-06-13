public class example2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            //Throw exception
            throw new RuntimeException("Unchecked error");
            //System.out.println("1");
        } catch (Exception e) { //Exception interrupted
            System.out.println("2 " + e); //Exception calculated
        }
        System.out.println("3");
    }
}
