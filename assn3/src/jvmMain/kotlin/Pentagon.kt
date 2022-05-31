import org.jetbrains.skia.Point3
import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt

class Pentagon(val point1: MyPoint, val point2: MyPoint, val point3: MyPoint, val point4: MyPoint, val point5: MyPoint) : Shape() {
    override var pointList: MutableList<MyPoint> = mutableListOf(point1, point2, point3, point4, point5)

    init {
        runChecks()
    }

    private fun runChecks() {
        if (pointList.size != 5) {
            throw IllegalArgumentException("Pentagon must have 5 points")
        }
    }

    override fun getArea(): Double {
        var area = (
                (pointList[0].getX()) * (pointList[4].getY()) -
                (pointList[4].getX()) * (pointList[0].getY()) +
                (pointList[4].getX()) * (pointList[3].getY()) -
                (pointList[3].getX()) * (pointList[4].getY()) +
                (pointList[3].getX()) * (pointList[2].getY()) -
                (pointList[2].getX()) * (pointList[3].getY()) +
                (pointList[2].getX()) * (pointList[1].getY()) -
                (pointList[1].getX()) * (pointList[2].getY()) +
                (pointList[1].getX()) * (pointList[0].getY()) -
                (pointList[0].getX()) * (pointList[1].getY())
            ) / 2
        return (area * 100.0).roundToInt() / 100.0
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        for (point in pointList) {
            point.movePoint(xDelta, yDelta)
        }
    }
}