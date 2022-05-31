import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.sqrt

internal class NPointStarTest {
    @Test
    fun getPointList() {
        val point1 = MyPoint(-1.0, 1.0)
        val point2 = MyPoint(1.0, -1.0)
        val point3 = MyPoint(-1.0, -1.0)
        val point4 = MyPoint(1.0, 1.0)
        val myPointList = listOf(point1, point2, point3, point4)
        val nPointStar = NPointStar(myPointList)
        val pointList = nPointStar.pointList
        assertEquals(point1, pointList[0])
        assertEquals(point2, pointList[1])
        assertEquals(point3, pointList[2])
        assertEquals(point4, pointList[3])
    }

    @Test
    fun getLineList() {
        val point1 = MyPoint(-1.0, 1.0)
        val point2 = MyPoint(1.0, -1.0)
        val point3 = MyPoint(-1.0, -1.0)
        val point4 = MyPoint(1.0, 1.0)
        val myPointList = listOf(point1, point2, point3, point4)
        val nPointStar = NPointStar(myPointList)
        val lineList = nPointStar.getLineList()
        assertEquals(2, lineList.size)

        assertEquals(-1.0, lineList[0].point1.getX())
        assertEquals(1.0, lineList[0].point1.getY())
        assertEquals(1.0, lineList[0].point2.getX())
        assertEquals(-1.0, lineList[0].point2.getY())

        assertEquals(-1.0, lineList[1].point1.getX())
        assertEquals(-1.0, lineList[1].point1.getY())
        assertEquals(1.0, lineList[1].point2.getX())
        assertEquals(1.0, lineList[1].point2.getY())
    }

    @Test
    fun tryOddPoints() {
        val point1 = MyPoint(-1.0, 1.0)
        val point2 = MyPoint(1.0, -1.0)
        val point3 = MyPoint(-1.0, -1.0)
        val point4 = MyPoint(1.0, 1.0)
        val point5 = MyPoint(0.0, 0.0)
        assertThrows(IllegalArgumentException::class.java) {
            NPointStar(listOf(point1, point2, point3, point4, point5))
        }
    }

    @Test
    fun tryPointsLT4() {
        val point1 = MyPoint(-1.0, 1.0)
        val point2 = MyPoint(1.0, -1.0)
        val point3 = MyPoint(-1.0, -1.0)
        assertThrows(IllegalArgumentException::class.java) {
            NPointStar(listOf(point1, point2, point3))
        }
    }

    @Test
    fun getArea() {
        val point1 = MyPoint(-1.0, 1.0)
        val point2 = MyPoint(1.0, -1.0)
        val point3 = MyPoint(-1.0, -1.0)
        val point4 = MyPoint(1.0, 1.0)
        val myPointList = listOf(point1, point2, point3, point4)
        val nPointStar = NPointStar(myPointList)
        val area = nPointStar.getArea()
        assertEquals(2 * sqrt(8.0), area)
    }

    @Test
    fun getArea3() {
        val point1 = MyPoint(-1.0, 1.0)
        val point2 = MyPoint(1.0, -1.0)
        val point3 = MyPoint(-1.0, -1.0)
        val point4 = MyPoint(1.0, 1.0)
        val point5 = MyPoint(0.0, 1.0)
        val point6 = MyPoint(0.0, -1.0)
        val myPointList = listOf(point1, point2, point3, point4, point5, point6)
        val nPointStar = NPointStar(myPointList)
        val area = nPointStar.getArea()
        assertEquals((2 * sqrt(8.0)) + 2, area)
    }
}