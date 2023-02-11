package lesson5.lesson6;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        double[] array = new double[4];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Введите ваше " + (i+1) + "-е число: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                array[i] = scanner.nextDouble();
            } else {
                System.out.println("Error");
            }
        }

       System.out.println("Значение первого элемента = " + array[0]);

    }
}
