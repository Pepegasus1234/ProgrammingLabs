import java.io.*;
import java.util.Scanner;

class Strana implements Serializable {
    String film; // название фильма
    int yearOfIssue; // год выпуска
    String name; // название страны
    String genre; // жанр
    double price; // стоимость
}
public class example34_02Lab12 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in, "cp1251");
// создается файл на диске
        File f = new File("C:\\Java\\JavaLab1");
        f.createNewFile();
// -------------ЗАПИСЬ ОБЪЕКТА В ФАЙЛ-------------
// Создается поток для записи объекта
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
// Вводится информация об объекте (стране)
        System.out.print("Введите кол-во фильмов: ");
        int numbersFilms = sc.nextInt();
        Strana strana = new Strana();
        for (int i = 0; i <= numbersFilms ; i++) {
            System.out.println("Введите информацию о фильмах: ");
            System.out.println("Название фильма => ");
            strana.film = sc.nextLine();
            System.out.print("Год выпуска => ");
            strana.yearOfIssue = sc.nextInt();
            System.out.print("Название страны => ");
            strana.name = sc.nextLine();
            System.out.print("Жанр => ");
            strana.genre = sc.nextLine();
            System.out.print("Стоимость => ");
            strana.price = sc.nextDouble();
// Объект записывается в файл
            oos.writeObject(strana);
        }
// Дописывается информация и закрывается файловый поток
        oos.flush();
        oos.close();
// -------------ЧТЕНИЕ ОБЪЕКТА ИЗ ФАЙЛА-------------
// Создается поток для чтения объекта из файла
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream oin = new ObjectInputStream(fis);

        System.out.println("Введите страну, чтобы посмотреть фильмы по ней:");
        String nameStrana = sc.nextLine();
// Объект считывается, и на экран выводится требуемая информация
        strana = (Strana) oin.readObject();

        if (nameStrana.equals(strana.name)){
            System.out.println("Название фильма " + strana.film);
            System.out.print("Год выпуска " + strana.yearOfIssue);
            System.out.print("Название страны " + strana.name);
            System.out.print("Жанр " + strana.genre);
            System.out.print("Стоимость " + strana.price);
        }

// Поток закрывается
        oos.close();
    }
}
