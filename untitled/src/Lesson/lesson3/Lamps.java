package lesson3;

public class Lamps {
    public static void main(String[] args) {
        int quantity = 556;
        blink(quantity);
    }
    static void blink (int quantity){
        quantity = ~quantity;
        System.out.println(Integer.toBinaryString(quantity));

    }
}
