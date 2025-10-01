package ru.fors.Geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test

    void cacCalculateArea ()
    {
        var t = new Triangle(5.0, 4.0,3.0);
        double result = t.area();
        Assertions.assertEquals(12.0, result);
    }

}
