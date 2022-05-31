import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PentagonTest {

    @Test
    fun getArea() {
        val pentagon = Pentagon(MyPoint(0.0, 0.0),5.0)
        assertEquals(43.01, pentagon.getArea())
    }

    @Test
    fun tryNegArea() {
        assertThrows(IllegalArgumentException::class.java) {
            Pentagon(MyPoint(0.0, 0.0), -5.0)
        }
    }

    @Test
    fun moveShape() {
        val pentagon = Pentagon(MyPoint(0.0, 0.0),5.0)
        pentagon.moveShape(1.0, 1.0)
        assertEquals(1.0, pentagon.point1.getX())
        assertEquals(1.0, pentagon.point1.getY())
    }
}