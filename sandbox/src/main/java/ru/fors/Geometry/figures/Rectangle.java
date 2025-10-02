package ru.fors.Geometry.figures;

public record Rectangle (double a, double b)
{
public  Rectangle {
    if (a < 0 || b<0 ) {
        throw new IllegalArgumentException("Rectagle side should be non-negative");
    }
}

    public static void printRectangleArea(double a, double b) {

        var text = String.format("Площадь прямоугольника со сторонами %f и %f = %f",a,b,RectangleArea(a,b));
        System.out.println(text);

    }

    private static double RectangleArea(double a, double b) {
        return a*b;
    }
}
