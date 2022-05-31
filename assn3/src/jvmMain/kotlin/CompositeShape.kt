import kotlin.math.roundToInt

class CompositeShape(userPoints: List<MyPoint>, userShapes: List<Shape>) : Shape() {
    override var pointList: MutableList<MyPoint> = mutableListOf()
    private var shapeList: MutableList<Shape> = mutableListOf()

    init {
        pointList.addAll(userPoints)
        shapeList.addAll(userShapes)
        runChecks()
    }

    private fun runChecks() {
        if (shapeList.size <= 1) {
            throw IllegalArgumentException("Composite shape must have at least 2 shapes")
        }
        if (pointList.size < 2) {
            throw IllegalArgumentException("Composite shape must have at least 2 points")
        }
    }

    fun getShapeList(): List<Shape> {
        return shapeList
    }

    override fun getArea(): Double {
        var area = 0.0
        for (shape in shapeList) {
            area += shape.getArea()
        }
        area = area.roundToInt().toDouble()
        return area
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        for (shape in shapeList) {
            shape.moveShape(xDelta, yDelta)
        }
    }
}