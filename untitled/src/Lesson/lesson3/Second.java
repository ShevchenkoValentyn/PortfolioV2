package lesson3;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {


        int Number;
        System.out.print("Введите Ваше первое целочисленное число: ");
        checkOptions();


    }

    public static void checkOptions() {
        int number;
        int check = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                System.out.println(number);
                check++;
            } else {
                System.out.println("Вы ввели нецелочисленное число. Повторите попытку!\n");
            }
        } while (check == 0);
    }


}
