package strategyClasses

import Circle
import MyPoint
import Shape
import java.util.concurrent.ThreadLocalRandom

class MakeCircle : ShapeStrategy {
    private var pointList: MutableList<MyPoint> = mutableListOf()
    override fun makeShape(shapeOrShapes: MutableList<String>): Shape {
        val randomRadius = ThreadLocalRandom.current().nextDouble(1.0, 25.0);
        pointList.add(MyPoint(0.0, 0.0))
        return Circle(MyPoint(0.0, 0.0), randomRadius)
    }

    fun getPointList(): MutableList<MyPoint> {
        return pointList
    }
}