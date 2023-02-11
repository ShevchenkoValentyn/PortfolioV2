package lesson2;

public class CubPlosha {
    public static void main(String[] args) {
        int square = sumaForSquare(2);
        System.out.println("Сумма всех сторон квадрата: " + square + " см");
        int rectangle = sumaForRectangle(1, 2);
        System.out.println("Сумма всех сторон прямоугольника: " + rectangle + " см");
        if (square == 0 || rectangle == 0) {
            if (square == 0 && rectangle != 0) {
                System.out.println("Данные о квадрате неверны. Сумма не может быть равно 0!");
            } else if (square != 0 && rectangle == 0) {
                System.out.println("Данные о прямоугольнике неверны. Сумма не может быть равно 0!");
            } else {
                System.out.println("Обе фигуры измеряны неверно! Сумма не может быть равно 0!");
            }
        } else if (square > rectangle) {System.out.println("Квадрат больше");
        } else if (square < rectangle) {System.out.println("Прямоугольник больше");
        } else {System.out.println("Они равны!");}
    }

    static int sumaForSquare(int i) {
        return i * 4;
    }

    static int sumaForRectangle(int i, int b) {
        return (i + b) * 2;
    }
}
