import kotlin.math.abs

class Square(point1: MyPoint, point2: MyPoint): Rectangle(point1, point2) {
    override var width: Double = Double.NEGATIVE_INFINITY
    override var height: Double = Double.NEGATIVE_INFINITY

    init {
        runChecks()
    }

    private fun runChecks() {
        width = abs(point2.getX() - point1.getX())
        if (width == 0.0) {
            throw IllegalArgumentException("Width cannot be 0")
        }
        height = abs(point2.getY() - point1.getY())
        if (height == 0.0) {
            throw IllegalArgumentException("Height cannot be 0")
        }
        if (width != height) {
            throw IllegalArgumentException("Square's height must be equal to width")
        }
    }
}