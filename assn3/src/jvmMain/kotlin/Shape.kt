import java.awt.Point

abstract class Shape {
    abstract var pointList : MutableList<MyPoint>
    abstract fun getArea(): Double
    abstract fun moveShape(xDelta: Double, yDelta: Double)
}