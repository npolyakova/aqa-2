import java.util.Scanner;

public class CycleFor {

    //3. Найти сумму всех целых чисел от a до b (значения a и b вводятся с клавиатуры; b>=a).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите а");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();

        int sum = 0;
        if (b >= a) {
            for (int i = a; i <= b; i++) {
                sum = sum + i;
            }
            System.out.println(sum);
        } else {
            System.out.println("Error");
        }
    }
}
