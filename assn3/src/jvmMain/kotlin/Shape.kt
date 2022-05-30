abstract class Shape {
    abstract var point1: MyPoint
    abstract var point2: MyPoint?
    abstract fun getArea(): Double
    open fun moveShape(xDelta: Double, yDelta: Double) {
        point1.movePoint(xDelta, yDelta)
        point2?.movePoint(xDelta, yDelta)
    }
}