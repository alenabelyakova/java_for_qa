package ru.fors.Geometry.figures;

public class Square {
    public static void printSquareArea(double a) {
        String text = String.format("Площадь квадрата со стороной %f = %f", a, sqareArea(a));
        System.out.println(text);
    }

    private static double sqareArea(double a) {
        return a * a;
    }
}
