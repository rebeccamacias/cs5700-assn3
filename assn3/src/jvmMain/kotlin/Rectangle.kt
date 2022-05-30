import kotlin.math.abs

open class Rectangle(override var point1: MyPoint, override var point2: MyPoint?): Shape() {
    open var width: Double = Double.NEGATIVE_INFINITY //must be public for square to use
    open var height: Double = Double.NEGATIVE_INFINITY //must be public for square to use

    init {
        runChecks()
    }

    private fun runChecks() {
        //These checks make sure that you have set points to be opposing corners.
        //This also ensures that 0 Area is not possible.
        width = abs(point2!!.getX() - point1.getX())
        if (width == 0.0) {
            throw IllegalArgumentException("Width cannot be 0")
        }
        height = abs(point2!!.getY() - point1.getY())
        if (height == 0.0) {
            throw IllegalArgumentException("Height cannot be 0")
        }
    }

    fun getFirstPoint(): MyPoint {
        return point1
    }

    fun getSecondPoint(): MyPoint {
        return point2!!
    }

    override fun getArea(): Double {
        return abs(width * height)
    }
}