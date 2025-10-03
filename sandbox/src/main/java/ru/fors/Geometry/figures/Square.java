package ru.fors.Geometry.figures;

import java.util.Objects;

public final class Square {
    private final double a;


    public Square(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Square side should be non-negative");
        }
        this.a = a;
    }

    public static void printSquareArea(Square s) {
        String text = String.format("Площадь квадрата со стороной %f = %f", s.a, s.area());
        System.out.println(text);
    }


    public double area() {
        return this.a * this.a;
    }

    public double perimeter() {
        return 4 * this.a;
    }

    public double a() {
        return a;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Square) obj;
        return Double.doubleToLongBits(this.a) == Double.doubleToLongBits(that.a);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }

    @Override
    public String toString() {
        return "Square[" +
                "a=" + a + ']';
    }

}
