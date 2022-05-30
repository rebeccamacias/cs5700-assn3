import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertDoesNotThrow

internal class SquareTest {

    @Test
    fun getSetPoint1() {
        var square = Square(MyPoint(1.0, 2.0), MyPoint(3.0, 4.0))
        assertEquals(1.0, square.point1.getX())
        assertEquals(2.0, square.point1.getY())
    }

    @Test
    fun getSetPoint2() {
        var square = Square(MyPoint(1.0, 2.0), MyPoint(3.0, 4.0))
        assertEquals(3.0, square.point2!!.getX())
        assertEquals(4.0, square.point2!!.getY())
    }

    @Test
    fun getArea() {
        var square = Square(MyPoint(1.0, 2.0), MyPoint(3.0, 4.0))
        assertEquals(4.0, square.getArea())
    }

    @Test
    fun tryDifferingWidthHeight() {
        assertThrows(IllegalArgumentException::class.java) {
            Square(MyPoint(1.0, 2.0), MyPoint(3.0, 5.0))
        }
    }

    @Test
    fun moveShape() {
        var square = Square(MyPoint(0.0, 3.0), MyPoint(3.0, 0.0))
        square.moveShape(1.0, 1.0)
        assertEquals(1.0,square.point1.getX())
        assertEquals(4.0, square.point1.getY())
        assertEquals(4.0, square.point2!!.getX())
        assertEquals(1.0, square.point2!!.getY())
    }
}