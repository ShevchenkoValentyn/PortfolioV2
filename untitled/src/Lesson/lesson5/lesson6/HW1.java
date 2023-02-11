package lesson5.lesson6;

import java.util.Objects;
import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {
        int checkDay = 0, checkAll = 0, checkExit = 0, checkLine = 0;
        String[] array = new String[7];
        System.out.println("Введите дни недели, начиная с первого дня недели по седьмой ");

        for (int i = 0; i < array.length; i++) {

            do {
                checkLine = 0;
                Scanner scanner = new Scanner(System.in);
                System.out.print((i + 1) + " день недели: ");
                if (scanner.hasNextInt()) {
                    System.out.println("Вы ввели число! Введено неверно! Повторите!");
                } else {
                    array[i] = scanner.nextLine();
                    if (Objects.equals(array[i], "Понедельник")
                            || Objects.equals(array[i], "Вторник")
                            || Objects.equals(array[i], "Среда")
                            || Objects.equals(array[i], "Четверг")
                            || Objects.equals(array[i], "Пятница")
                            || Objects.equals(array[i], "Суббота")
                            || Objects.equals(array[i], "Воскресенье")) {

                        switch (array[i]){
                            case "Понедельник":
                                if (Objects.equals(array[0], "Понедельник")){
                                    checkLine = 1;
                                } else {
                                    System.out.println("Перепутали название дней недели!");
                                }
                                break;
                            case "Вторник":
                                if (Objects.equals(array[1], "Вторник")){
                                    checkLine = 1;
                                } else {
                                    System.out.println("Перепутали название дней недели!");
                                }
                                break;
                            case "Среда":
                                if (Objects.equals(array[2], "Среда")){
                                    checkLine = 1;
                                } else {
                                    System.out.println("Перепутали название дней недели!");
                                }
                                break;
                            case "Четверг":
                                if (Objects.equals(array[3], "Четверг")){
                                    checkLine = 1;
                                } else {
                                    System.out.println("Перепутали название дней недели!");
                                }
                                break;
                            case "Пятница":
                                if (Objects.equals(array[4], "Пятница")){
                                    checkLine = 1;
                                } else {
                                    System.out.println("Перепутали название дней недели!");
                                }
                                break;
                            case "Суббота":
                                if (Objects.equals(array[5], "Суббота")){
                                    checkLine = 1;
                                } else {
                                    System.out.println("Перепутали название дней недели!");
                                }
                                break;
                            case "Воскресенье":
                                if (Objects.equals(array[6], "Воскресенье")){
                                    checkLine = 1;
                                } else {
                                    System.out.println("Перепутали название дней недели!");
                                }
                                break;
                        }

                    }else {
                        System.out.println("Такого дня недели нет! Повторите написание!");
                    }
                }
            } while (checkLine == 0);
        }
        //Цикл повтора выбора даты!
        do {
            checkAll = 0;

            //цикл выбора даты и проверка
            do {
                checkDay = 0;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите число от 1 до 7");
                if (scanner.hasNextInt()) {
                    int dayChoice = scanner.nextInt();
                    if (dayChoice < 1 || dayChoice > 7) {
                        System.out.println("Введено неверно! Вам нужно ввести число от 1 до 7 (включительно)");
                    } else {
                        System.out.println("Ваш выбор дня недели: " + array[dayChoice - 1]);
                        checkDay = 1;
                    }
                } else {
                    System.out.println("Введено неверно! Повторите попытку!");
                }
            } while (checkDay == 0);
            System.out.println();
            do {
                checkExit = 0;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Хотите повторить выбор числа?\n1 - Да;\n2 - Нет");
                if (scanner.hasNextInt()) {
                    int exitOptions = scanner.nextInt();
                    if (exitOptions < 1 || exitOptions > 2) {
                        System.out.println("Такого выбора нет! Повторите!");
                    } else if (exitOptions == 1) {
                        checkAll = 0;
                        checkExit = 1;
                    } else {
                        System.out.println("GOOD BYE!");
                        checkExit = 1;
                        checkAll = 1;
                    }
                } else {
                    System.out.println("Введено неверно! Повторите!");
                }
            } while (checkExit == 0);


        } while (checkAll == 0);


    }
}
