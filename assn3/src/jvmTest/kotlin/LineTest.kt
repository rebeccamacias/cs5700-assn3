import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import kotlin.math.sqrt

internal class LineTest {

    @Test
    fun getAreaInLine() {
        val point1 = MyPoint(0.0, 0.0)
        val point2 = MyPoint(0.0, 1.0)
        val line = Line(point1, point2)
        assertEquals(1.0, line.getArea())
    }

    @Test
    fun getAreaDiag(){
        val point1 = MyPoint(0.0, 0.0)
        val point2 = MyPoint(1.0, 1.0)
        val line = Line(point1, point2)
        assertEquals(sqrt(2.0), line.getArea())
    }

    @Test
    fun getAreaNegDiag(){
        val point1 = MyPoint(0.0, 0.0)
        val point2 = MyPoint(-1.0, 1.0)
        val line = Line(point1, point2)
        assertEquals(1.4142135623730951, line.getArea())
    }

    @Test
    fun getPoints() {
        val point1 = MyPoint(0.0, 0.0)
        val point2 = MyPoint(1.0, 1.0)
        val line = Line(point1, point2)
        assertEquals(2, line.getPoints().size)
        assertEquals(0.0, line.getPoints()[0].getX())
        assertEquals(0.0, line.getPoints()[0].getY())
        assertEquals(1.0, line.getPoints()[1].getX())
        assertEquals(1.0, line.getPoints()[1].getY())
    }

    @Test
    fun moveShape() {
        val point1 = MyPoint(0.0, 0.0)
        val point2 = MyPoint(1.0, 1.0)
        val line = Line(point1, point2)
        line.moveShape(1.0, 1.0)
        assertEquals(1.0, line.getPoints()[0].getX())
        assertEquals(1.0, line.getPoints()[0].getY())
        assertEquals(2.0, line.getPoints()[1].getX())
        assertEquals(2.0, line.getPoints()[1].getY())
    }

    @Test
    fun getPosSlope() {
        var point1 = MyPoint(0.0, 0.0)
        var point2 = MyPoint(1.0, 1.0)
        var line = Line(point1, point2)
        assertEquals(1.0, line.getSlope())
    }

    @Test
    fun getNegSlope() {
        var point1 = MyPoint(0.0, 0.0)
        var point2 = MyPoint(-1.0, 7.0)
        var line = Line(point1, point2)
        assertEquals(-7.0, line.getSlope())
    }

    @Test
    fun getZeroSlope() {
        var point1 = MyPoint(7.0 ,0.0)
        var point2 = MyPoint(0.0, 0.0)
        var line = Line(point1, point2)
        assertEquals(0.0, line.getSlope())
    }

    @Test
    fun getSetPoint1() {
        var point1 = MyPoint(7.0, 0.0)
        var point2 = MyPoint(0.0, 0.0)
        var line = Line(point1, point2)
        var point3 = MyPoint(1.0, 1.0)
        line.point1 = point3
        assertEquals(1.0, line.point1.getX())
        assertEquals(1.0, line.point1.getY())
    }

    @Test
    fun getSetPoint2() {
        var point1 = MyPoint(7.0, 0.0)
        var point2 = MyPoint(0.0, 0.0)
        var line = Line(point1, point2)
        var point3 = MyPoint(1.0, 1.0)
        line.point2 = point3
        assertEquals(1.0, line.point2.getX())
        assertEquals(1.0, line.point2.getY())
    }

    @Test
    fun getSetEqualPoints() {
        var point1 = MyPoint(7.0, 0.0)
        var point2 = MyPoint(7.0, 0.0)
        assertThrows(IllegalArgumentException::class.java) {
            Line(point1, point2)
        }
    }
}