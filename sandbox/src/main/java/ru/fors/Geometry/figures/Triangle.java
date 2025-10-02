package ru.fors.Geometry.figures;

import static java.lang.Math.sqrt;

public record Triangle (double a, double b, double c)

{

    public  Triangle {
        if (a < 0 || b<0 || c<0) {
            throw new IllegalArgumentException("Triangle side should be non-negative");
        }
        if ((a+b<c)|| (a+c<b)|| (b+c<a)) {
            throw new IllegalArgumentException("Triangle sides should be write");
        }

    }


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


    public double area() {
    return  this.a + this.b + this.c;
    }

    public double square() {
    return sqrt (((a+b+c)/2)* (((a+b+c)/2)-a) *  (((a+b+c)/2)-b) * (((a+b+c)/2)-c));}
}

