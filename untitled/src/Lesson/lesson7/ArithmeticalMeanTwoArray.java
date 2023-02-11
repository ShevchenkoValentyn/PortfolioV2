package lesson7;

import java.util.Arrays;
import java.util.Scanner;

public class ArithmeticalMeanTwoArray {
    public static void main(String[] args) {
        int stroka1, stolbcov1, stroka2, stolbcov2;
        System.out.print("Задайте кол. столбцов (1-го массива):  ");
        Scanner scannerStolbcov1 = new Scanner(System.in);
        stolbcov1 = scannerStolbcov1.nextInt();
        System.out.print("Задайте длину строки (1-го массива):  ");
        Scanner scannerStroka1 = new Scanner(System.in);
        stroka1 = scannerStroka1.nextInt();

        System.out.print("Задайте кол. столбцов (2-го массива):  ");
        Scanner scannerStolbcov2 = new Scanner(System.in);
        stolbcov2 = scannerStolbcov2.nextInt();
        System.out.print("Задайте длину строки (2-го массива):  ");
        Scanner scannerStroka2 = new Scanner(System.in);
        stroka2 = scannerStroka2.nextInt();

//Инициализация с помощью random
        int[][] arrayOne = new int[stolbcov1][stroka1];
        int[][] arrayTwo = new int[stolbcov2][stroka2];
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                arrayOne[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                arrayTwo[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("______________________________");
//Вывод неотсортированных
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                System.out.print(arrayOne[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("______________________________");
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                System.out.print(arrayTwo[i][j] + "  ");
            }
            System.out.println();
        }


//// Сортировка первого массива
//        for (int i = 0; i < arrayOne.length; i++) {
//            int pos = i;
//            int min = arrayOne[i];
//            for (int j = i + 1; j < arrayOne.length; j++) {
//                if (min > arrayOne[j]) {
//                    pos = j;
//                    min = arrayOne[j];
//                }
//            }
//            arrayOne[pos] = arrayOne[i];
//            arrayOne[i] = min;
//        }
//        System.out.println("Отсортированный 1-й массив: " + Arrays.toString(arrayOne));
//
//
//// Сортировка второго массива
//        for (int i = 0; i < arrayTwo.length; i++) {
//            int pos = i;
//            int min = arrayTwo[i];
//            for (int j = i + 1; j < arrayTwo.length; j++) {
//                if (min > arrayTwo[j]) {
//                    pos = j;
//                    min = arrayTwo[j];
//                }
//            }
//            arrayTwo[pos] = arrayTwo[i];
//            arrayTwo[i] = min;
//        }
//        System.out.println("Отсортированный 2-й массив: " + Arrays.toString(arrayTwo));
//
//
//        double arithmeticalMeanCount = 0;
//        double arithmeticalMiddle;
//
//        for (int i = 0; i < arrayOne.length; i++) {
//            arithmeticalMeanCount += arrayOne[i];
//        }
//        arithmeticalMiddle = arithmeticalMeanCount / arrayOne.length;
//        System.out.println("Сред. Ариф. 1-й массив: " + arithmeticalMiddle);
//
//        //Обнуление.
//
//        arithmeticalMeanCount = 0;
//        arithmeticalMiddle = 0;
//
//        //Обнуление.
//
//        for (int i = 0; i < arrayTwo.length; i++) {
//            arithmeticalMeanCount += arrayTwo[i];
//        }
//        arithmeticalMiddle = arithmeticalMeanCount / arrayTwo.length;
//        System.out.println("Сред. Ариф. 2-й массив: " + arithmeticalMiddle);

    }
}
