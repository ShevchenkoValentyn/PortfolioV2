package lesson5;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int year = 0;
        int[] array = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scannerYear = new Scanner(System.in);
        Scanner scannerMonth = new Scanner(System.in);
        Scanner scannerDay = new Scanner(System.in);
        int day30 = 0;
        int day31 = 0;
        for (int element : array){
            if(element == 30){
                day30++;
            }else if (element == 31){
                day31++;
            }
        }
        System.out.println("Месяцев с 30 днём = " + day30);
        System.out.println("Месяцев с 31 днём = " + day31);


        System.out.print("Введите год: ");
        if (scannerYear.hasNextInt()) {
            year = scannerYear.nextInt();
            if (year % 4 == 0) {
                array[1] = 29;
            }
        } else {
            System.out.println("Error");
        }
        System.out.print("Введите месяц: ");
        String month = scannerMonth.nextLine();

        switch (month) {
            case "Январь":
                int dayResult = 0;
                int monthNumber = 1;
                System.out.print("Введите дату: ");
                if (scannerDay.hasNextInt()) {
                    int day = scannerDay.nextInt();
                    if (day > array[0] || day == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.println("Год указанный Вами: " + year);
                        System.out.println("Месяц указанный Вами: " + month);
                        System.out.println("Дата указанная Вами: " + day + " число");
                        System.out.println(day + "." + month + "." + year);

                        //Подсчёт дней:
                        for (int j = 1; j <= day; j++) {
                            dayResult++;
                        }
                        System.out.println("С начала этого года до Вашей даты прошло: " + dayResult + " дней.");

                    }
                } else {
                    System.out.println("Error");
                }
                break;
            case "Февраль":
                monthNumber = 2;
                dayResult = 0;
                System.out.print("Введите дату: ");
                if (scannerDay.hasNextInt()) {
                    int day = scannerDay.nextInt();
                    if (day > array[1] || day == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.println("Год указанный Вами: " + year);
                        System.out.println("Месяц указанный Вами: " + month);
                        System.out.println("Дата указанная Вами: " + day + " число");
                        System.out.println(day + "." + month + "." + year);

                        //Подсчёт дней:
                        for (int i = 0; i < monthNumber - 1; i++) {
                            dayResult += array[i];
                        }
                        for (int j = 1; j <= day; j++) {
                            dayResult++;
                        }
                        System.out.println("С начала этого года до Вашей даты прошло: " + dayResult + " дней.");

                    }
                } else {
                    System.out.println("Error");
                }
                break;
            case "Март":
                monthNumber = 3;
                dayResult = 0;
                System.out.print("Введите дату: ");
                if (scannerDay.hasNextInt()) {
                    int day = scannerDay.nextInt();
                    if (day > array[2] || day == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.println("Год указанный Вами: " + year);
                        System.out.println("Месяц указанный Вами: " + month);
                        System.out.println("Дата указанная Вами: " + day + " число");
                        System.out.println(day + "." + month + "." + year);

                        //Подсчёт дней:
                        for (int i = 0; i < monthNumber - 1; i++) {
                            dayResult += array[i];
                        }
                        for (int j = 1; j <= day; j++) {
                            dayResult++;
                        }
                        System.out.println("С начала этого года до Вашей даты прошло: " + dayResult + " дней.");

                    }
                } else {
                    System.out.println("Error");
                }
                break;
            case "Апрель":
                monthNumber = 4;
                dayResult = 0;
                System.out.print("Введите дату: ");
                if (scannerDay.hasNextInt()) {
                    int day = scannerDay.nextInt();
                    if (day > array[3] || day == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.println("Год указанный Вами: " + year);
                        System.out.println("Месяц указанный Вами: " + month);
                        System.out.println("Дата указанная Вами: " + day + " число");
                        System.out.println(day + "." + month + "." + year);

                        //Подсчёт дней:
                        for (int i = 0; i < monthNumber - 1; i++) {
                            dayResult += array[i];
                        }
                        for (int j = 1; j <= day; j++) {
                            dayResult++;
                        }
                        System.out.println("С начала этого года до Вашей даты прошло: " + dayResult + " дней.");

                    }
                } else {
                    System.out.println("Error");
                }
                break;
            case "Май":
                monthNumber = 5;
                dayResult = 0;
                System.out.print("Введите дату: ");
                if (scannerDay.hasNextInt()) {
                    int day = scannerDay.nextInt();
                    if (day > array[4] || day == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.println("Год указанный Вами: " + year);
                        System.out.println("Месяц указанный Вами: " + month);
                        System.out.println("Дата указанная Вами: " + day + " число");
                        System.out.println(day + "." + month + "." + year);

                        //Подсчёт дней:
                        for (int i = 0; i < monthNumber - 1; i++) {
                            dayResult += array[i];
                        }
                        for (int j = 1; j <= day; j++) {
                            dayResult++;
                        }
                        System.out.println("С начала этого года до Вашей даты прошло: " + dayResult + " дней.");

                    }
                } else {
                    System.out.println("Error");
                }
                break;
            case "Июнь":
                monthNumber = 6;
                dayResult = 0;
                System.out.print("Введите дату: ");
                if (scannerDay.hasNextInt()) {
                    int day = scannerDay.nextInt();
                    if (day > array[5] || day == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.println("Год указанный Вами: " + year);
                        System.out.println("Месяц указанный Вами: " + month);
                        System.out.println("Дата указанная Вами: " + day + " число");
                        System.out.println(day + "." + month + "." + year);

                        //Подсчёт дней:
                        for (int i = 0; i < monthNumber - 1; i++) {
                            dayResult += array[i];
                        }
                        for (int j = 1; j <= day; j++) {
                            dayResult++;
                        }
                        System.out.println("С начала этого года до Вашей даты прошло: " + dayResult + " дней.");

                    }
                } else {
                    System.out.println("Error");
                }
                break;
            case "Июль":
                monthNumber = 7;
                dayResult = 0;
                System.out.print("Введите дату: ");
                if (scannerDay.hasNextInt()) {
                    int day = scannerDay.nextInt();
                    if (day > array[6] || day == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.println("Год указанный Вами: " + year);
                        System.out.println("Месяц указанный Вами: " + month);
                        System.out.println("Дата указанная Вами: " + day + " число");
                        System.out.println(day + "." + month + "." + year);

                        //Подсчёт дней:
                        for (int i = 0; i < monthNumber - 1; i++) {
                            dayResult += array[i];
                        }
                        for (int j = 1; j <= day; j++) {
                            dayResult++;
                        }
                        System.out.println("С начала этого года до Вашей даты прошло: " + dayResult + " дней.");

                    }
                } else {
                    System.out.println("Error");
                }
                break;
            case "Август":
                monthNumber = 8;
                dayResult = 0;
                System.out.print("Введите дату: ");
                if (scannerDay.hasNextInt()) {
                    int day = scannerDay.nextInt();
                    if (day > array[7] || day == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.println("Год указанный Вами: " + year);
                        System.out.println("Месяц указанный Вами: " + month);
                        System.out.println("Дата указанная Вами: " + day + " число");
                        System.out.println(day + "." + month + "." + year);

                        //Подсчёт дней:
                        for (int i = 0; i < monthNumber - 1; i++) {
                            dayResult += array[i];
                        }
                        for (int j = 1; j <= day; j++) {
                            dayResult++;
                        }
                        System.out.println("С начала этого года до Вашей даты прошло: " + dayResult + " дней.");

                    }
                } else {
                    System.out.println("Error");
                }
                break;
            case "Сентябрь":
                monthNumber = 9;
                dayResult = 0;
                System.out.print("Введите дату: ");
                if (scannerDay.hasNextInt()) {
                    int day = scannerDay.nextInt();
                    if (day > array[8] || day == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.println("Год указанный Вами: " + year);
                        System.out.println("Месяц указанный Вами: " + month);
                        System.out.println("Дата указанная Вами: " + day + " число");
                        System.out.println(day + "." + month + "." + year);

                        //Подсчёт дней:
                        for (int i = 0; i < monthNumber - 1; i++) {
                            dayResult += array[i];
                        }
                        for (int j = 1; j <= day; j++) {
                            dayResult++;
                        }
                        System.out.println("С начала этого года до Вашей даты прошло: " + dayResult + " дней.");

                    }
                } else {
                    System.out.println("Error");
                }
                break;
            case "Октябрь":
                monthNumber = 10;
                dayResult = 0;
                System.out.print("Введите дату: ");
                if (scannerDay.hasNextInt()) {
                    int day = scannerDay.nextInt();
                    if (day > array[9] || day == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.println("Год указанный Вами: " + year);
                        System.out.println("Месяц указанный Вами: " + month);
                        System.out.println("Дата указанная Вами: " + day + " число");
                        System.out.println(day + "." + month + "." + year);

                        //Подсчёт дней:
                        for (int i = 0; i < monthNumber - 1; i++) {
                            dayResult += array[i];
                        }
                        for (int j = 1; j <= day; j++) {
                            dayResult++;
                        }
                        System.out.println("С начала этого года до Вашей даты прошло: " + dayResult + " дней.");

                    }
                } else {
                    System.out.println("Error");
                }
                break;
            case "Ноябрь":
                monthNumber = 11;
                dayResult = 0;
                System.out.print("Введите дату: ");
                if (scannerDay.hasNextInt()) {
                    int day = scannerDay.nextInt();
                    if (day > array[10] || day == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.println("Год указанный Вами: " + year);
                        System.out.println("Месяц указанный Вами: " + month);
                        System.out.println("Дата указанная Вами: " + day + " число");
                        System.out.println(day + "." + month + "." + year);

                        //Подсчёт дней:
                        for (int i = 0; i < monthNumber - 1; i++) {
                            dayResult += array[i];
                        }
                        for (int j = 1; j <= day; j++) {
                            dayResult++;
                        }
                        System.out.println("С начала этого года до Вашей даты прошло: " + dayResult + " дней.");

                    }
                } else {
                    System.out.println("Error");
                }
                break;
            case "Декабрь":
                monthNumber = 12;
                dayResult = 0;
                System.out.print("Введите дату: ");
                if (scannerDay.hasNextInt()) {
                    int day = scannerDay.nextInt();
                    if (day > array[11] || day == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.println("Год указанный Вами: " + year);
                        System.out.println("Месяц указанный Вами: " + month);
                        System.out.println("Дата указанная Вами: " + day + " число");
                        System.out.println(day + "." + month + "." + year);

                        //Подсчёт дней:
                        for (int i = 0; i < monthNumber - 1; i++) {
                            dayResult += array[i];
                        }
                        for (int j = 1; j <= day; j++) {
                            dayResult++;
                        }
                        System.out.println("С начала этого года до Вашей даты прошло: " + dayResult + " дней.");

                    }
                } else {
                    System.out.println("Error");
                }
                break;

        }


    }

}
