import java.io.*;
import java.net.URL;

public class example2_Lab11 {
    public static void main(String[] args) {
        try {
            // // File
            InputStream inFile = new FileInputStream("C:/Users/bubic/Desktop/rand.txt");
            readAllByByte((inFile));
            System.out.println("\n\n\n");
            inFile.close();

            // URL
            InputStream inUrl = new URL("http://google.com").openStream();
            readAllByByte(inUrl);
            System.out.println("\n\n\n");
            inUrl.close();

            InputStream inArray = new ByteArrayInpSutStream(new byte[] {7, 9, 3, 7, 4});
            readAllByByte(inArray);
            System.out.println("\n\n\n");
            inArray.close();
        }
        catch (IOException e) {
            System.out.println("Error: "+e);
        }
    }
    public static void readAllByByte (InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != 1) {
                System.out.println((char) oneByte);
            }
            else {
                System.out.println("\nend");
                break;
            }
        }
    }
}
