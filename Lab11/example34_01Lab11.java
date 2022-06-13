import java.io.*;
import java.util.Scanner;

public class example34_01Lab11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя файла =>");
        String fname = in.nextLine();
        try {
            File f = new File(fname);
            f.createNewFile();
            System.out.println("Полный путь файла: " + f.getAbsolutePath());
            System.out.print("Введите количество строк для записи файла типа String =>");
            int n = in.nextInt();
            DataOutputStream f1Out = new DataOutputStream(new FileOutputStream(f));
            in.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.print("Введите строку для записи файла => ");
                String s = in.nextLine();
                f1Out.writeUTF(s);
            }

            System.out.print("Введите количество цифр в третьей строке =>");
            int d = in.nextInt();
            DataOutputStream f2Out = new DataOutputStream(new FileOutputStream(f));
            in.nextLine();
            for (int i = 0; i < d; i++) {
                System.out.print("Введите цифры типа double => ");
                f2Out.writeDouble(in.nextDouble());
            }
            f1Out.flush();
            f2Out.flush();
            f1Out.close();
            f2Out.close();

            DataInputStream rd = new DataInputStream(new FileInputStream(f));
            while (true) {
                System.out.println(rd.readUTF());
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
