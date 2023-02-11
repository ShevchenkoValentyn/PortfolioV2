package lesson4;

public class RandomDemo {
    public static void main(String[] args) {
        int randomFirst, randomSecond, randomThird;
        randomFirst = getRandom();
        randomSecond = getRandom();
        randomThird = getRandom();
        System.out.println(randomFirst + "  " + randomSecond + "  " + randomThird);
        System.out.println(randomFirst + randomSecond + randomThird);

    }

    public static int getRandom() {
        return (int) (Math.random() * 10);
    }
}
