package ru.fors.Geometry;

import ru.fors.Geometry.figures.Rectangle;
import ru.fors.Geometry.figures.Square;
import ru.fors.Geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {

        Square.printSquareArea (new Square(7.0));
        Square.printSquareArea (new Square(5.0));
        Square.printSquareArea (new Square(3.0));

        Rectangle.printRectangleArea (-3.0, 5.0);


        Triangle.printTriangleArea(3,-4,5);
        Triangle.printTriangleSquare(3,-4,5);

    }


}

