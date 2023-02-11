package lesson2;

import java.util.Scanner;

public class Calculator_Int {

    public static void main(String[] args) {
        int checkFirstNumber = 0;
        int checkSecondNumber = 0;
        while (checkFirstNumber == 0) {
            Scanner scannerFirstNumber = new Scanner(System.in);
            System.out.print("Введите первое целочисленное число: ");
            int firstNumber = numberChange(scannerFirstNumber);
            if (firstNumber != 0) {

                while (checkSecondNumber == 0) {
                    Scanner scannerSecondNumber = new Scanner(System.in);
                    System.out.print("Введите второе целочисленное число: ");
                    int secondNumber = numberChange(scannerSecondNumber);
                    if (secondNumber != 0) {

                        System.out.println("\nВаше первое число: " + firstNumber);
                        System.out.println("Ваше второе число: " + secondNumber + "\n");


                        int sum = sum(firstNumber, secondNumber);
                        int minus = minus(firstNumber, secondNumber);
                        int multiplication = multiplication(firstNumber, secondNumber);
                        double separation = separation(firstNumber, secondNumber);
                        int drobPersent = drobPersent(firstNumber, secondNumber);

                        System.out.println("Сумма Ваших чисел: " + sum);
                        System.out.println("Разница Ваших чисел: " + minus);
                        System.out.println("Умножение Ваших чисел: " + multiplication);
                        System.out.println("Деление Ваших чисел: " + separation);
                        System.out.println("Процент Ваших чисел: " + drobPersent);
                        checkSecondNumber++;
                    } else {
                        System.out.println("Второе число не целочисленное число");
                    }
                }
                checkFirstNumber++;
            } else {
                System.out.println("Первое число не целочисленное число");
            }
        }


    }


    public static int numberChange(Scanner scanner) {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else return 0;
    }

    static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static int minus(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    static int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    static double separation(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    static int drobPersent(int firstNumber, int secondNumber) {
        return firstNumber % secondNumber;
    }
}
