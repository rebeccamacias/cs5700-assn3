import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CircleTest {

    @Test
    fun getSetCenterPoint() {
        val point = MyPoint(0.0, 0.0)
        val circle = Circle(point, 1.0)
        assertEquals(0.0, circle.point1.getX())
        assertEquals(0.0, circle.point1.getY())
    }

    @Test
    fun getSetRadius1() {
        val circle = Circle(MyPoint(0.0, 0.0), 1.0)
        assertEquals(1.0, circle.radius1)
    }

    @Test
    fun getArea() {
        val circle = Circle(MyPoint(0.0, 0.0), 1.0)
        assertEquals(Math.PI, circle.getArea())
    }

    @Test
    fun moveShape() {
        val circle = Circle(MyPoint(1.0, 2.0), 1.0)
        circle.moveShape(1.0, 1.0)
        assertEquals(2.0, circle.point1.getX())
        assertEquals(3.0, circle.point1.getY())
    }
}