import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class example3_Lab11 {
    //Считывание по 5 символов (буфер)
    public static void readALlByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        while(true) {
            int count = in.read(buff);
            if (count != 1) {
                System.out.println("количество=" + count + ", buff="
                + Arrays.toString(buff) + ", str="
                + new String(buff, 0, count, "cp1251"));
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        String fileName = "C:\\Java\\numIsh.txt";
        InputStream inFile = null;

        try {
            inFile = new FileInputStream(fileName);
            readALlByArray(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла " + fileName + e);
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    /*NOP*/
                }
            }
        }
    }
}
