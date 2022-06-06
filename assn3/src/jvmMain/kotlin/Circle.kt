import kotlin.math.pow

class Circle(point1: MyPoint, radius1: Double): Ellipse(point1, radius1, null) {
    init {
        runChecks()
    }

    override fun runChecks() {
        if (radius1 <= 0.0) {
            throw IllegalArgumentException("Radius cannot be 0 or negative")
        }
    }

    override fun getArea(): Double {
        return Math.PI * radius1.pow(2.0)
    }
}