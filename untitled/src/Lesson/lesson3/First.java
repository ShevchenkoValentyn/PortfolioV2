package lesson3;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        boolean check = true;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите Ваше целочисленное число: ");
            if(scanner.hasNextInt()){
                int firstNumber = scanner.nextInt();
                System.out.println("\nВаше число: " + firstNumber);
                int checkPair = firstNumber & 1;
                if (checkPair == 0) {
                    System.out.println("Ваше число ЧЁТНОЕ");
                }else {
                    System.out.println("Ваше число НЕЧЁТНОЕ");
                }

                check = false;
            } else{
                System.out.println("Вы ввели нецелочисленное число. Повторите попытку!");
            }
        }while(check==true);



    }
}
