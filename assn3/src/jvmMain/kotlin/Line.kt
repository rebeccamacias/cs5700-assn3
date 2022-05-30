import kotlin.math.pow
import kotlin.math.sqrt

class Line(override var point1: MyPoint, override var point2: MyPoint?): Shape() {
    init {
        runChecks()
    }

    private fun runChecks() {
        if (point1 == null || point2 == null) {
            throw IllegalArgumentException("Points cannot be null")
        }
        if (point1.getX() == point2?.getX() && point1.getY() == point2?.getY()) {
            throw IllegalArgumentException("Points cannot be the same")
        }
    }

    override fun getArea(): Double {
        return sqrt(
            (point2!!.getX() - point1.getX()).pow(2.0) + (point2!!.getY() - point1.getY()).pow(2.0)
        )
    }

    fun getPoints(): List<MyPoint> {
        return listOf(point1, point2!!)
    }

    fun getSlope() : Double {
        return (point1.getY() - point2!!.getY()) / (point1.getX() - point2!!.getX())
    }
}