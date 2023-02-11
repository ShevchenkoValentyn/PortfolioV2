package lesson4;

import java.util.Scanner;

public class HomeWorkFirst {
    public static void main(String[] args) {
        int check = 0;
        do {
            if(check % 10 == 0 && check != 0){
                System.out.print(check + "  ");
            }
            check++;
        }while (check <= 100);
    }
}
