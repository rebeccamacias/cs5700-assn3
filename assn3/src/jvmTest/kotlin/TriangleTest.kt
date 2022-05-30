import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.pow
import kotlin.math.sqrt

internal class TriangleTest {
    @Test
    fun getSetPoint1() {
        val point1 = MyPoint(0.0, 0.0)
        val point2 = MyPoint(0.0, 1.0)
        val point3 = MyPoint(1.0, 0.0)
        val triangle = Triangle(point1, point2, point3)
        assertEquals(0.0, triangle.get1stPoint().getX())
        assertEquals(0.0, triangle.get1stPoint().getY())
    }

    @Test
    fun getSetPoint2() {
        val point1 = MyPoint(0.0, 0.0)
        val point2 = MyPoint(0.0, 1.0)
        val point3 = MyPoint(1.0, 0.0)
        val triangle = Triangle(point1, point2, point3)
        assertEquals(0.0, triangle.get2ndPoint().getX())
        assertEquals(1.0, triangle.get2ndPoint().getY())
    }

    @Test
    fun getSetPoint3() {
        val point1 = MyPoint(0.0, 0.0)
        val point2 = MyPoint(0.0, 1.0)
        val point3 = MyPoint(1.0, 0.0)
        val triangle = Triangle(point1, point2, point3)
        assertEquals(1.0, triangle.get3rdPoint().getX())
        assertEquals(0.0, triangle.get3rdPoint().getY())
    }


    @Test
    fun getAreaPos() { //right triangle
        val point1 = MyPoint(0.0, 0.0)
        val point2 = MyPoint(4.0, 0.0)
        val point3 = MyPoint(0.0, 4.0)
        val triangle = Triangle(point1, point2, point3)
        val point1point2Dist = sqrt(
            (point1.getX() - point2!!.getX()).pow(2.0) + (point1.getY() - point2!!.getY()).pow(2.0)
        )
        val point1point3Dist = sqrt(
            (point1.getX() - point3.getX()).pow(2.0) + (point1.getY() - point3.getY()).pow(2.0)
        )
        val point2point3Dist = sqrt(
            (point2!!.getX() - point3.getX()).pow(2.0) + (point2!!.getY() - point3.getY()).pow(2.0)
        )
        val s = (point1point2Dist + point1point3Dist + point2point3Dist) / 2
        val area = sqrt(s * (s - point1point2Dist) * (s - point1point3Dist) * (s - point2point3Dist))
        assertEquals(area, triangle.getArea())
    }

    @Test
    fun getAreaNeg() { //right triangle
        val point1 = MyPoint(0.0, 0.0)
        val point2 = MyPoint(-4.0, 0.0)
        val point3 = MyPoint(-4.0, 2.0)
        val triangle = Triangle(point1, point2, point3)
        assertEquals(4.0, triangle.getArea())
    }

    @Test
    fun getAreaScalene() {
        val point1 = MyPoint(0.0, 0.0)
        val point2 = MyPoint(-5.0, 0.0)
        val point3 = MyPoint(-2.0, 2.0)
        val triangle = Triangle(point1, point2, point3)
        assertEquals(5.0, triangle.getArea())
    }

    @Test
    fun getZeroArea() {
        val point1 = MyPoint(0.0, 0.0)
        val point2 = MyPoint(0.0, 0.0)
        val point3 = MyPoint(0.0, 0.0)
        assertThrows(IllegalArgumentException::class.java) {
            val triangle = Triangle(point1, point2, point3)
        }
    }

    @Test
    fun moveShape() {
        val point1 = MyPoint(0.0, 0.0)
        val point2 = MyPoint(-4.0, 0.0)
        val point3 = MyPoint(0.0, 4.0)
        val triangle = Triangle(point1, point2, point3)
        triangle.moveShape(1.0, -1.0)
        assertEquals(1.0, triangle.get1stPoint().getX())
        assertEquals(-1.0, triangle.get1stPoint().getY())
        assertEquals(-3.0, triangle.get2ndPoint().getX())
        assertEquals(-1.0, triangle.get2ndPoint().getY())
        assertEquals(1.0, triangle.get3rdPoint().getX())
        assertEquals(3.0, triangle.get3rdPoint().getY())
    }
}