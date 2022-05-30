import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class EllipseTest {

    @Test
    fun getSetCenterPoint() {
        val point1 = MyPoint(0.0, 0.0)
        val ellipse = Ellipse(point1, 5.0, 6.0)
        assertEquals(0.0, ellipse.point1.getX())
        assertEquals(0.0, ellipse.point1.getY())
    }

    @Test
    fun getSetRadius1() {
        val ellipse = Ellipse(MyPoint(0.0, 0.0), 1.0, 5.0)
        assertEquals(1.0, ellipse.get1stRadius())
    }

    @Test
    fun getSetRadius2() {
        val ellipse = Ellipse(MyPoint(0.0, 0.0), 1.0, 5.0)
        assertEquals(5.0, ellipse.get2ndRadius())
    }

    @Test
    fun getArea() {
        val radius1 = 1.0
        val radius2 = 2.0
        val ellipse = Ellipse(MyPoint(0.0, 0.0), 1.0, 2.0)
        assertEquals(Math.PI * radius1 * radius2, ellipse.getArea())
    }

    @Test
    fun getAreaR1Zero() {
        val radius1 = 0.0
        val radius2 = 2.0
        assertThrows(IllegalArgumentException::class.java) {
            Ellipse(MyPoint(0.0, 0.0), radius1, radius2)
        }
    }

    @Test
    fun getAreaR2Zero() {
        val radius1 = 2.0
        val radius2 = 0.0
        assertThrows(IllegalArgumentException::class.java) {
            Ellipse(MyPoint(0.0, 0.0), radius1, radius2)
        }
    }

    @Test
    fun getAreaBothZeros() {
        val radius1 = 0.0
        val radius2 = 0.0
        assertThrows(IllegalArgumentException::class.java) {
            Ellipse(MyPoint(0.0, 0.0), radius1, radius2)
        }
    }

    @Test
    fun moveShape() {
        val point = MyPoint(0.0, 0.0)
        val ellipse = Ellipse(point, 5.0, 6.0)
        ellipse.moveShape(1.0, 1.0)
        assertEquals(1.0, ellipse.point1.getX())
        assertEquals(1.0, ellipse.point1.getY())
    }
}