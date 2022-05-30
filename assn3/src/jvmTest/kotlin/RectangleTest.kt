import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RectangleTest {

    @Test
    fun getFirstPoint() {
        val rectangle = Rectangle(MyPoint(0.0, 10.0), MyPoint(3.0, 2.0))
        assertEquals(0.0, rectangle.getFirstPoint().getX())
        assertEquals(10.0, rectangle.getFirstPoint().getY())
    }

    @Test
    fun getSecondPoint() {
        val rectangle = Rectangle(MyPoint(0.0, 10.0), MyPoint(3.0, 2.0))
        assertEquals(3.0, rectangle.getSecondPoint().getX())
        assertEquals(2.0, rectangle.getSecondPoint().getY())
    }

    @Test
    fun getWidth() {
        val rectangle = Rectangle(MyPoint(0.0, 10.0), MyPoint(3.0, 2.0))
        assertEquals(3.0, rectangle.width)
    }

    @Test
    fun getHeight() {
        val rectangle = Rectangle(MyPoint(0.0, 10.0), MyPoint(3.0, 2.0))
        assertEquals(8.0, rectangle.height)
    }

    @Test
    fun tryZeroWidth() {
        assertThrows(IllegalArgumentException::class.java) {
            Rectangle(MyPoint(1.0, 2.0), MyPoint(1.0, 7.0))
        }
    }

    @Test
    fun tryZeroHeight() {
        assertThrows(IllegalArgumentException::class.java) {
            Rectangle(MyPoint(1.0, 2.0), MyPoint(3.0, 2.0))
        }
    }

    @Test
    fun getArea() {
        var rectangle = Rectangle(MyPoint(1.0, 2.0), MyPoint(3.0, 5.0))
        assertEquals(6.0, rectangle.getArea())
    }

    @Test
    fun getAreaWithNegatives() {
        var rectangle = Rectangle(MyPoint(-1.0, 2.0), MyPoint(-3.0, 5.0))
        assertEquals(6.0, rectangle.getArea())
    }

    @Test
    fun tryZeroArea() {
        assertThrows(IllegalArgumentException::class.java) {
            Rectangle(MyPoint(1.0, 2.0), MyPoint(1.0, 2.0))
        }
    }

    @Test
    fun moveShape() {
        var rectangle = Rectangle(MyPoint(1.0, 2.0), MyPoint(3.0, 5.0))
        rectangle.moveShape(3.0, 4.0)
        assertEquals(4.0, rectangle.point1.getX())
        assertEquals(6.0, rectangle.point1.getY())
        assertEquals(6.0, rectangle.point2!!.getX())
        assertEquals(9.0, rectangle.point2!!.getY())
    }

    @Test
    fun moveShapeNegDelta(){
        var rectangle = Rectangle(MyPoint(1.0, 2.0), MyPoint(3.0, 5.0))
        rectangle.moveShape(-3.0, -4.0)
        assertEquals(-2.0, rectangle.point1.getX())
        assertEquals(-2.0, rectangle.point1.getY())
        assertEquals(0.0, rectangle.point2!!.getX())
        assertEquals(1.0, rectangle.point2!!.getY())
    }
}