package MyDemoPrikoly;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int checkAll = 0;
        System.out.println("Привет. Вы зашли в калькулятор. Для того, чтобы провести расчёт -- введите, " +
                "пожалуйста, Ваши числа. Пока что, рассчёты ведутся по два числа. Спасибо. " +
                "Приносим свои извинения за временное неудобство!");
        do {
            int actionOption = 0, checkOption = 0;
            int checkAction = 0, checkFirstNumber = 0, checkSecondNumber = 0, checkOptionAll = 0;
            double firstNumberDouble = 0, secondNumberDouble = 0;

            while (checkFirstNumber == 0) {
                System.out.print("Введите Ваше первое число: ");
                Scanner scannerFirstNumber = new Scanner(System.in);
                if (scannerFirstNumber.hasNextDouble()) {
                    firstNumberDouble = scannerFirstNumber.nextDouble();
                    checkFirstNumber++;
                } else {
                    System.out.println("Error");
                }
            }
            //////////
            while (checkSecondNumber == 0) {
                System.out.print("Введите Ваше второе число: ");
                Scanner scannerSecondNumber = new Scanner(System.in);
                if (scannerSecondNumber.hasNextDouble()) {
                    secondNumberDouble = scannerSecondNumber.nextDouble();
                    checkSecondNumber++;
                } else {
                    System.out.println("Error");
                }
            }
            //////////////////
            while (checkAction == 0) {
                Scanner scannerActionOption = new Scanner(System.in);
                System.out.println("Выберите действие, где: \n\t1. Минусование\n\t2. Прибавление\n\t3. Умножение" +
                        "\n\t4. Деление\n\t5. Остаток от деления");
                if (scannerActionOption.hasNextInt()) {
                    actionOption = scannerActionOption.nextInt();
                    if (actionOption < 1 || actionOption > 5) {
                        System.out.println("Такого действия нет! Ошибка!");
                    } else {
                        checkAction++;
                    }

                } else {
                    System.out.println("Ввели неверно число!");
                }
            }
            switch (actionOption) {
                case 1:
                    System.out.println("Результат минусования: " + minusOption(firstNumberDouble, secondNumberDouble));
                    break;
                case 2:
                    System.out.println("Результат добавления: " + plusOption(firstNumberDouble, secondNumberDouble));
                    break;
                case 3:
                    System.out.println("Результат умножения: " + multiplicationOption(firstNumberDouble, secondNumberDouble));
                    break;
                case 4:
                    if (secondNumberDouble == 0) {
                        System.out.println("Деление на ноль НЕВОЗМОЖНО");
                    } else {
                        System.out.println("Результат деления: " + divisionOption(firstNumberDouble, secondNumberDouble));
                    }
                    break;
                case 5:
                    if (secondNumberDouble == 0) {
                        System.out.println("Деление на ноль НЕВОЗМОЖНО");
                    } else {
                        System.out.println("Результат деления на остаток: " + percentageOfDivisionOption(firstNumberDouble, secondNumberDouble));
                    }
                    break;
            }
            while (checkOptionAll == 0) {
                Scanner scannerCheckAll = new Scanner(System.in);
                System.out.println("Выберите действие, где: \n\t1. Повторить\n\t2. Завершить работу программы");
                if (scannerCheckAll.hasNextInt()) {
                    checkOption = scannerCheckAll.nextInt();
                    if (checkOption < 1 || checkOption > 2) {
                        System.out.println("Такого действия нет! Ошибка!");
                    } else {
                        checkOptionAll++;
                    }
                } else {
                    System.out.println("Ввели неверно число!");
                }
            }
            switch (checkOption) {
                case 1:

                    break;
                case 2:
                    checkAll++;
                    break;
            }
        } while (checkAll == 0);
    }


    static double minusOption(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    static double plusOption(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    static double multiplicationOption(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    static double divisionOption(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    static double percentageOfDivisionOption(double firstNumber, double secondNumber) {
        return firstNumber % secondNumber;
    }

}
