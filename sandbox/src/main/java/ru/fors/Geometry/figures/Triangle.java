package ru.fors.Geometry.figures;

public record Triangle (double a, double b, double c) {
    public static void printTriangleArea(double a, double b, double c) {

        var text = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", a, b, c, TriangleArea(a, b, c));
        System.out.println(text);
    }

    private static double TriangleArea(double a, double b, double c) {
        return a + b + c;
    }
}
