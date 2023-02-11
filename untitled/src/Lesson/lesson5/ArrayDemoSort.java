package lesson5;

import java.util.Arrays;

public class ArrayDemoSort {
    public static void main(String[] args) {
        int[] array = new int[5];
        int temp;
        boolean sorted = false;
        for (int i = 0; i < 5; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print(array[i] + "  ");
        }

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            Arrays.sort(array);
            System.out.print(array[i] + "  ");
        }


    }
}
