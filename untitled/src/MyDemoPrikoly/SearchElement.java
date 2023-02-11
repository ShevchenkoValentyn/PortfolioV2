package MyDemoPrikoly;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int lengthArray = 0;
        boolean checkIntScanner = false;
        while (!checkIntScanner) {
            System.out.print("Введите длину массива: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                lengthArray = scanner.nextInt();
                checkIntScanner = true;
            } else {
                System.out.println("Error");
            }
        }

        int[] arrayOne = new int[lengthArray];
//Инициализация с помощью рандома (1)
        for (int i = 0; i < arrayOne.length; i++) {
            arrayOne[i] = (int) (Math.random() * 30);
        }
        System.out.println("Ваш неотсортированный массив(1): " + Arrays.toString(arrayOne));

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

        System.out.println("Ваш отсортированный массив(1): " + Arrays.toString(arrayOne));

        System.out.println("Какое число вы хотите найти? Пожалуйста, введите его!");
        int searchNumber = 0;
        int position = -1;
        checkIntScanner = false;
        while (!checkIntScanner) {
            System.out.print("Введите целочисленное число: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                searchNumber = scanner.nextInt();
                checkIntScanner = true;
            } else {
                System.out.println("Error");
            }
        }

        int j = arrayOne.length / 2;

        if (arrayOne[j] > searchNumber) {
            for (int i = 0; i < j; i++) {
                if (arrayOne[i] == searchNumber) {
                    position = i;
                    System.out.println("Ваше искомое число (" + searchNumber + ") находится под индексом: " + position);
                }
            }
            if (position == -1){
                System.out.println("Вашего искомого числа в массиве нет!");
            }
        }
        if (arrayOne[j] < searchNumber) {
            for (int i = j; i < arrayOne.length; i++) {
                if (arrayOne[i] == searchNumber) {
                    position = i;
                    System.out.println("Ваше искомое число (" + searchNumber + ") находится под индексом: " + position);
                }
            }
            if (position == -1){
                System.out.println("Вашего искомого числа в массиве нет!");
            }
        }
        if (arrayOne[j] == searchNumber) {
            System.out.println("Ваше искомое число (" + searchNumber + ") находится под индексом: " + j);
        }


    }
}
