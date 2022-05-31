import kotlin.math.abs

open class Ellipse(var point1: MyPoint, val radius1: Double, val radius2: Double?) : Shape() {
    override var pointList: MutableList<MyPoint> = mutableListOf(point1)

    init {
        runChecks()
    }

    fun get1stRadius(): Double {
        return radius1
    }

    fun get2ndRadius(): Double {
        return radius2!!
    }

    open fun runChecks() {
        if (radius1 <= 0 || radius2!! <= 0) {
            throw IllegalArgumentException("Radii must be greater than 0")
        }
    }

    override fun getArea(): Double {
        return Math.PI * radius1 * radius2!!
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        for (point in pointList) {
            point.movePoint(xDelta, yDelta)
        }
    }
}