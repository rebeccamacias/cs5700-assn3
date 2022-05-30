import kotlin.math.abs

open class Ellipse(override var point1: MyPoint, val radius1: Double, val radius2: Double?) : Shape() {
    override var point2: MyPoint? = null

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
}