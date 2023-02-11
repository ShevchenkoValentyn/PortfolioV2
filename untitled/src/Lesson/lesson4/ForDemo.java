package lesson4;

public class ForDemo {
    public static void main(String[] args) {
        char symbol = 'G';
        for (int i = 5; i < 50; i++){
            System.out.print(symbol);
            symbol += i;
        }
    }
}
