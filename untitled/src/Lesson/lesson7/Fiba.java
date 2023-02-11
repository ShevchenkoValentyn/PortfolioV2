package lesson7;

public class Fiba {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Фібоначі: ");

        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        seeArrayOnTable(array);
//Реверс
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] =  tmp;
        }
        seeArrayOnTable(array);

    }

    public static void seeArrayOnTable(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
