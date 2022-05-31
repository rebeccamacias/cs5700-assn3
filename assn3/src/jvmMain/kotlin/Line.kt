import kotlin.math.pow
import kotlin.math.sqrt

class Line(var point1: MyPoint, var point2: MyPoint): Shape() {
    override var pointList: MutableList<MyPoint> = mutableListOf(point1, point2)
    init {
        runChecks()
    }

    private fun runChecks() {
        if (point1.getX() == point2.getX() && point1.getY() == point2.getY()) {
            throw IllegalArgumentException("Points cannot be the same")
        }
    }

    override fun getArea(): Double {
        return sqrt(
            (point2.getX() - point1.getX()).pow(2.0) + (point2.getY() - point1.getY()).pow(2.0)
        )
    }

    fun getPoints(): MutableList<MyPoint> {
        return pointList
    }

    fun getSlope() : Double {
        return (point1.getY() - point2.getY()) / (point1.getX() - point2.getX())
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        for (point in pointList) {
            point.movePoint(xDelta, yDelta)
        }
    }
}