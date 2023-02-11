package lesson4;

public class HomeWorkSecond {
    public static void main(String[] args) {
        int random = getRandom();
        System.out.println("Number = " + random);
        if (random == 0){
            System.out.println("Факториал Вашего числа = 1");
        }else {
            int result = 1;
            for (int i = 1; i <= random; i++){
                result *= i;
            }
            System.out.println("Факториал Вашего числа = " + result);
        }

    }
    public static int getRandom() {
        return (int) (Math.random() * 10);
    }
}
