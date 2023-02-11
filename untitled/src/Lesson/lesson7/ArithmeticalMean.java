package lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticalMean {
    public static void main(String[] args) {
        int lengthArray1, lengthArray2;
        System.out.print("Задайте длину массива (1-го):  ");
        Scanner scanner = new Scanner(System.in);
        lengthArray1 = scanner.nextInt();
        System.out.print("Задайте длину массива (2-го):  ");
        Scanner scanner2 = new Scanner(System.in);
        lengthArray2 = scanner2.nextInt();


        int[] arrayOne = new int[lengthArray1];
        int[] arrayTwo = new int[lengthArray2];

        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < arrayTwo.length; i++) {
            arrayTwo[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));


// Сортировка первого массива
        for (int i = 0; i < arrayOne.length; i++) {
            int pos = i;
            int min = arrayOne[i];
            for (int j = i + 1; j < arrayOne.length; j++) {
                if (min > arrayOne[j]) {
                    pos = j;
                    min = arrayOne[j];
                }
            }
            arrayOne[pos] = arrayOne[i];
            arrayOne[i] = min;
        }
        System.out.println("Отсортированный 1-й массив: " + Arrays.toString(arrayOne));


// Сортировка второго массива
        for (int i = 0; i < arrayTwo.length; i++) {
            int pos = i;
            int min = arrayTwo[i];
            for (int j = i + 1; j < arrayTwo.length; j++) {
                if (min > arrayTwo[j]) {
                    pos = j;
                    min = arrayTwo[j];
                }
            }
            arrayTwo[pos] = arrayTwo[i];
            arrayTwo[i] = min;
        }
        System.out.println("Отсортированный 2-й массив: " + Arrays.toString(arrayTwo));


        double arithmeticalMeanCount = 0;
        double arithmeticalMiddle;

        for (int i = 0; i < arrayOne.length; i++) {
            arithmeticalMeanCount += arrayOne[i];
        }
        arithmeticalMiddle = arithmeticalMeanCount / arrayOne.length;
        System.out.println("Сред. Ариф. 1-й массив: " + arithmeticalMiddle);

        //Обнуление.

        arithmeticalMeanCount = 0;
        arithmeticalMiddle = 0;

        //Обнуление.

        for (int i = 0; i < arrayTwo.length; i++) {
            arithmeticalMeanCount += arrayTwo[i];
        }
        arithmeticalMiddle = arithmeticalMeanCount / arrayTwo.length;
        System.out.println("Сред. Ариф. 2-й массив: " + arithmeticalMiddle);

    }
}
