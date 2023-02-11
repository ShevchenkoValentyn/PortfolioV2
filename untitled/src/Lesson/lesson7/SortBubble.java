package lesson7;

public class SortBubble {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "  ");
        }
        boolean checkSort = true;
        while (checkSort) {
            checkSort = false;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                     checkSort = true;
                }
            }
        }
        seeArrayOnTable(array);


    }

    static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public static void seeArrayOnTable(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }
}
