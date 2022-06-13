import java.io.File;

public class example1_Lab11 {
    public static void main(String[] args) {
        try {
            File f1 = new File("Rand.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("File created");
                System.out.println("Full path: "+f1.getAbsolutePath());
            }
            File f2 = new File("C:\\Rand2.txt");
            f2.createNewFile();
            System.out.println("Full path of Rand2 txt: " + f2.getAbsolutePath());

            File f3 = new File("C:\\RandDir\\RandDir1");
            f3.mkdirs();
            System.out.println("Ful path of last file: "+f3.getAbsolutePath());
        }
        catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }
}
