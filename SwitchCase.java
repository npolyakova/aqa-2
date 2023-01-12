import java.util.Scanner;

public class SwitchCase {

    //Составить программу, которая в зависимости от введенного названия дня недели (понедельник, вторник, ..., воскресенье),
    //выводит на экран порядковый номер этого дня недели (1, 2, ..., 7)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите названия дня недели: ");
        String dayName = sc.next();
        sc.close();

        switch (dayName) {
            case "Понедельник" -> System.out.println("1");
            case "Вторник" -> System.out.println("2");
            case "Среда" -> System.out.println("3");
            case "Четверг" -> System.out.println("4");
            case "Пятница" -> System.out.println("5");
            case "Суббота" -> System.out.println("6");
            case "Воскресенье" -> System.out.println("7");
            default -> System.out.println("Введено некорректное название дня недели");
        }
    }
}
