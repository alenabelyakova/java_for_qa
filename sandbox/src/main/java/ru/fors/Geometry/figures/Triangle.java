package ru.fors.Geometry.figures;

import static java.lang.Math.sqrt;

public record Triangle (double a, double b, double c)


{
    public static void printTriangleArea(double a, double b, double c) {

        var text = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", a, b, c, TriangleP(a, b, c));
        System.out.println(text);
    }

    private static double TriangleP(double a, double b, double c) {
        return a + b + c;
    }


    public static void printTriangleSquare(double a, double b, double c) {
        var text = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", a, b, c, TriangleS(a, b, c));
        System.out.println(text);
    }
    private static double TriangleS(double a, double b, double c) {
        return sqrt (((a+b+c)/2)* (((a+b+c)/2)-a) *  (((a+b+c)/2)-b) * (((a+b+c)/2)-c));
    }
    }

