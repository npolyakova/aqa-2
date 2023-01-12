public class CyclesWhileDoWhile {

    //4. Имеется фрагмент программы в виде оператора цикла с параметром, обеспечивающий вывод на экран "столбиком"
    // всех целых чисел от 10 до 30. Оформить этот фрагмент в виде:
    //    1. оператора цикла с предусловием;
    //    2. оператора цикла с постусловием.

    public static void main(String[] args) {
        for (int i = 10; i <= 30; i++) {
            System.out.println(i);
        }

        int start = 31;
        while (start <= 30) {
            System.out.println(start);
            start++;
        }

        do {
            System.out.println(start);
            start++;
        } while (start <= 30);
    }
}
