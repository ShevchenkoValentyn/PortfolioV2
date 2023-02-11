package lesson7;

public class SortVstavkami {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "  ");
        }
        for (int i = 0; i < array.length; i++){
            int valueFirst = array[i];
            int two = i-1;
            for (;two>=0; two--){
                if(valueFirst<array[two]){
                    array[two+1] = array[two];
                }else{
                    break;
                }
            }
            array[two+1] = valueFirst;
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
