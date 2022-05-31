import kotlin.math.abs
import kotlin.math.pow
import kotlin.math.roundToInt
import kotlin.math.sqrt

class Pentagon(var point1: MyPoint, private var sideLength: Double) : Shape() {
    override var pointList: MutableList<MyPoint> = mutableListOf(point1)

    init {
        runChecks()
    }

    private fun runChecks() {
        if (sideLength <= 0) {
            throw IllegalArgumentException("Side length must be greater than 0")
        }
    }

    override fun getArea(): Double {
        val exact = abs(sideLength.pow(2.0) * sqrt(25 + 10 * sqrt(5.0)) / 4)
        return (exact * 100.0).roundToInt() / 100.0
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        for (point in pointList) {
            point.movePoint(xDelta, yDelta)
        }
    }
}