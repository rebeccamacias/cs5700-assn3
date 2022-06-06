import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PentagonTest {

    @Test
    fun getArea() {
        val a = MyPoint(0.0, 3.0)
        val b = MyPoint(5.0 , 0.0)
        val c = MyPoint(3.0, -5.0)
        val d = MyPoint(-3.0, -5.0)
        val e = MyPoint(-5.0, 0.0)
        val pentagon = Pentagon(a, b, c, d, e)
        assertEquals(55.0, pentagon.getArea())
    }

    @Test
    fun moveShape() {
        val a = MyPoint(0.0, 3.0)
        val b = MyPoint(5.0 , 0.0)
        val c = MyPoint(3.0, -5.0)
        val d = MyPoint(-3.0, -5.0)
        val e = MyPoint(-5.0, 0.0)
        val pentagon = Pentagon(a, b, c, d, e)
        pentagon.moveShape(1.0, 1.0)
        assertEquals(1.0, pentagon.point1.getX())
        assertEquals(4.0, pentagon.point1.getY())
    }
}