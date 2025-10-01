public class Geometry {
    public static void main(String[] args) {
        printSquareArea (7.0);
        printSquareArea (5.0);
        printSquareArea (3.0);

        printRectangleArea (3.0, 5.0);

    }

    private static void printRectangleArea(double a, double b) {System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + RectangleArea(a, b));
    }

    private static double RectangleArea(double a, double b) {
        return a*b;
    }


    static void printSquareArea (double a) {System.out.println("Площадь квадрата со стороной " + a + " = " + sqareArea(a));}

    private static double sqareArea(double a) {
        return a * a;
    }
}

