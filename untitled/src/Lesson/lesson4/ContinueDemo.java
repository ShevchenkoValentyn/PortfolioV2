package lesson4;

public class ContinueDemo {
    public static void main(String[] args) {
        check:
        {
            for (int i = 1; i < 11; i++) {
                System.out.print("Тест " + i + " = ");
                for (int j = 0; j < 10; j++) {
                    if (j < 5) {
                        if (j % 2 == 0 && j < 5) {
                            System.out.print(" ");
                        }
                        System.out.print(j);
                    } else {
                        if (j % 2 != 0) {
                            System.out.print(" ");
                        }
                        System.out.print(j);
                    }


                }
                System.out.println();
            }

        }
    }
}
