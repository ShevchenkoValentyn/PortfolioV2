package lesson4;

import java.util.Scanner;

public class ChangeDayOfWeekElseIf {
    public static void main(String[] args) {
        int day;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Change day of week: (1-7) ");
        day = dayChange(scanner);
        if (day > 7 || day == 0) {
            System.out.println("Не верно!");
        } else {
            if (day == 1) {
                System.out.println("Monday");
            } else if (day == 2) {
                System.out.println("Tuesday");

            } else if (day == 3) {
                System.out.println("Wednesday");
            } else if (day == 4) {
                System.out.println("Thursday");
            } else if (day == 5) {
                System.out.println("Friday");
            } else if (day == 6) {
                System.out.println("Saturday");
            } else System.out.println("Sunday");
        }
    }

    public static int dayChange(Scanner scanner) {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else return 0;
    }


}
