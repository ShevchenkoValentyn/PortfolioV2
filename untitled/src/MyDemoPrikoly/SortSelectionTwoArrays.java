package MyDemoPrikoly;

import java.util.Arrays;
import java.util.Scanner;

public class SortSelectionTwoArrays {
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

        int[][] arrayOne = new int[lengthArray][lengthArray];
//Инициализация с помощью рандома (1)
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                arrayOne[i][j] = (int) (Math.random() * 30);
            }
        }
        System.out.println("Ваш неотсортированный массив(2): ");
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                System.out.print(arrayOne[i][j] + "  ");
            }
            System.out.println();
        }

        //System.out.println("Ваш неотсортированный массив(1): " + Arrays.toString(arrayOne));


        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {

                int pos = j;
                int min = arrayOne [i][j];

                for (int checkArray = j +1; checkArray < arrayOne[i].length; checkArray++){
                    if (min>arrayOne[i][checkArray]){
                        pos = checkArray;
                        min = arrayOne[i][checkArray];
                    }
                }
                arrayOne [i][pos] = arrayOne[i][j];
                arrayOne [i][j] = min;

            }
        }

        System.out.println("\n\nВаш отсортированный массив(2): ");
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                System.out.print(arrayOne[i][j] + "  ");
            }
            System.out.println();
        }
        //System.out.println("Ваш отсортированный массив(1): " + Arrays.toString(arrayOne));

    }
}
