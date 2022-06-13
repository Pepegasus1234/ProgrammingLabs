public class example3 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            //брошено исключение
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) { //исключение перехвачено
            System.out.println("1"); //исключение обработано
        } catch (RuntimeException e) { //исключение перехвачено
            System.out.println("2"); //исключение обработано
        } catch (Exception e) { //исключение перехвачено
            System.out.println("3"); //исключение обработано
        }
        System.out.println("4");
    }
}
