package lesson4;

import java.util.Scanner;

public class ChangeDayOfWeekSwitch {
    public static void main(String[] args) {
        int day;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Change day of week: (1-7) ");
        day = dayChange(scanner);
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");

                break;
            case 3:
                System.out.println("Wednesday");

                break;
            case 4:
                System.out.println("Thursday");

                break;
            case 5:
                System.out.println("Friday");

                break;
            case 6:
                System.out.println("Saturday");

                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Не верно!");
                break;
        }
    }

    public static int dayChange(Scanner scanner) {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else return 0;
    }


}
