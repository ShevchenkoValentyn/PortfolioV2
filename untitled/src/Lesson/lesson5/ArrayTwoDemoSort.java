package lesson5;

public class ArrayTwoDemoSort {
    public static void main(String[] args) {
        boolean sorted = false;
        int[][] array = new int[5][5];
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[i][j] > array[i][j+1]) {
                        temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                        sorted = false;
                    }
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }


    }
}
