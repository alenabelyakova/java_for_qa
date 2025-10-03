package ru.fors.Geometry.figures;

import java.util.Objects;

import static java.lang.Math.sqrt;

public record Triangle (double a, double b, double c)

{

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(this.b, triangle.a) == 0 && Double.compare(this.a, triangle.b) == 0 && Double.compare(this.c, triangle.c) == 0)
                || (Double.compare(this.a, triangle.a) == 0 && Double.compare(this.b, triangle.b) == 0 && Double.compare(this.c, triangle.c) == 0)
                || (Double.compare(this.c, triangle.a) == 0 && Double.compare(this.a, triangle.b) == 0 && Double.compare(this.b, triangle.c) == 0);
    }

    @Override
    public int hashCode() {
        return 1;
    }

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

