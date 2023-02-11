package MyDemoPrikoly;

import java.util.Arrays;
import java.util.Scanner;

public class SortBubble {
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

        boolean bubbleCheckOne = false;
        while (!bubbleCheckOne) {
            bubbleCheckOne = true;
            for (int i = 0; i < arrayOne.length - 1; i++) {
                if (arrayOne[i] > arrayOne[i + 1]) {
                    int temp = arrayOne[i];
                    arrayOne[i] = arrayOne[i + 1];
                    arrayOne[i + 1] = temp;
                    bubbleCheckOne = false;
                }

            }
        }
        System.out.println("Ваш отсортированный массив(1): " + Arrays.toString(arrayOne));


        System.out.println("\n\n");
        int[][] arrayTwo = new int[lengthArray][lengthArray];
//Инициализация с помощью рандома (2)
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                arrayTwo[i][j] = (int) (Math.random() * 10);
            }
        }
        //System.out.println("Ваш неотсортированный массив(2): " + Arrays.toString(arrayTwo));
        System.out.println("Ваш неотсортированный массив(2):");
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                System.out.print(arrayTwo[i][j] + "  ");
            }
            System.out.println();
        }


        boolean bubbleCheckTwo = false;
        while (!bubbleCheckTwo) {
            bubbleCheckTwo = true;
            for (int i = 0; i < arrayTwo.length; i++) {
                for (int j = 0; j<arrayTwo[i].length - 1; j++){
                    if (arrayTwo[i][j] > arrayTwo[i][j+1]){
                        int temp = arrayTwo[i][j];
                        arrayTwo[i][j] =arrayTwo[i][j+1];
                        arrayTwo[i][j+1] = temp;
                        bubbleCheckTwo = false;
                    }
                }
            }
        }


        //System.out.println("Ваш отсортированный массив(2): " + Arrays.toString(arrayTwo));
        System.out.println("Ваш отсортированный массив(2):");
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                System.out.print(arrayTwo[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
