import kotlin.math.pow
import kotlin.math.sqrt

class Triangle(override var point1: MyPoint, override var point2: MyPoint?, private var point3: MyPoint): Shape() {
    init {
        runChecks()
    }

    private fun runChecks() {
        //These checks ensure none of the points are the same, are not on the same line, and area is not 0.0
        if (point1.getX() == point2!!.getX() && point1.getY() == point2!!.getY()) {
            throw IllegalArgumentException("Points cannot be the same")
        }

        if (point1.getX() == point3.getX() && point1.getY() == point3.getY()) {
            throw IllegalArgumentException("Points cannot be the same")
        }

        if (point2!!.getX() == point3.getX() && point2!!.getY() == point3.getY()) {
            throw IllegalArgumentException("Points cannot be the same")
        }

        if ((point1.getX() == point2!!.getX() && point1.getX() == point3.getX()) || (point1.getY() == point2!!.getY() && point1.getY() == point3.getY())) {
            throw IllegalArgumentException("At least 1 point cannot be on the same line")
        }

        getArea() //called to check area is not 0.0
    }

//    Referenced Geeks For Geeks
//    https://www.geeksforgeeks.org/c-program-find-area-triangle/
    override fun getArea(): Double {
        val point1point2Dist = sqrt(
            (point1.getX() - point2!!.getX()).pow(2.0) + (point1.getY() - point2!!.getY()).pow(2.0)
        )
        val point1point3Dist = sqrt(
            (point1.getX() - point3.getX()).pow(2.0) + (point1.getY() - point3.getY()).pow(2.0)
        )
        val point2point3Dist = sqrt(
            (point2!!.getX() - point3.getX()).pow(2.0) + (point2!!.getY() - point3.getY()).pow(2.0)
        )
        val s = (point1point2Dist + point1point3Dist + point2point3Dist) / 2
        val area = sqrt(s * (s - point1point2Dist) * (s - point1point3Dist) * (s - point2point3Dist))
        if (area == 0.0) {
            throw IllegalArgumentException("Area cannot be zero")
        }
        return area
    }

    fun get1stPoint(): MyPoint {
        return point1
    }

    fun get2ndPoint(): MyPoint {
        return point2!!
    }

    fun get3rdPoint(): MyPoint {
        return point3
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        super.moveShape(xDelta, yDelta)
        point3.movePoint(xDelta, yDelta)
    }
}