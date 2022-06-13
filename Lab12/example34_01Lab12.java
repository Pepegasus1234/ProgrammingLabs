import java.io.*;


public class example34_01Lab12 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            // Создание потоков для чтения и записи с нужной кодировкой
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("C:\\Java\\kek.txt"), "cp1251"));

            out = new PrintWriter("C:\\Java\\kek2.txt", "cp1251");

            int lineCount = 0;
            String s;
            while ((s = br.readLine()).equals("В")) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.println(lineCount + ": " + s);
                // запись без перевода строки
            }

        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!!");
        } finally {
            out.close();
            out.flush();
            out.close();
        }
    }
}
