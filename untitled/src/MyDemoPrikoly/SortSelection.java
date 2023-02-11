package MyDemoPrikoly;

import java.util.Arrays;
import java.util.Scanner;

public class SortSelection {
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

            for (int i = 0; i< arrayOne.length; i++){
                int pos = i;
                int min = arrayOne[i];
                for (int j = i+1; j < arrayOne.length; j++){
                    if (min > arrayOne[j]){
                        pos = j;
                        min = arrayOne[j];
                    }
                }
                arrayOne[pos] = arrayOne[i];
                arrayOne [i] = min;
            }

        System.out.println("Ваш отсортированный массив(1): " + Arrays.toString(arrayOne));

    }
}
