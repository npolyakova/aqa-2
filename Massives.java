public class Massives {

    public static void main(String[] args) {

        double[] array1 = new double[6];
        String[] array2 = {"wef", "rwwr3"};
        String[] array3 = new String[2];

        array1[0] = 1.2;
        array1[1] = 3.1;

        for (int i = 0; i <= array1.length - 1; i++) {
            System.out.print(array1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i <= array2.length - 1; i++) {
            System.out.print(array2[i] + " ");
        }

        System.out.println();

        for (int i = 0; i <= array3.length - 1; i++) {
            System.out.print(array3[i] + " ");
        }
    }
}
