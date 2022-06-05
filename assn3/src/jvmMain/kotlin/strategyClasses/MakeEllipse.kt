package strategyClasses

import Ellipse
import MyPoint
import Shape
import java.util.concurrent.ThreadLocalRandom

class MakeEllipse : ShapeStrategy{
    private var pointList: MutableList<MyPoint> = mutableListOf()
    override fun makeShape(shapeOrShapes: MutableList<String>): Shape {
        val randomRadius1 = ThreadLocalRandom.current().nextDouble(1.0, 25.0);
        val randomRadius2 = ThreadLocalRandom.current().nextDouble(1.0, 25.0);
        pointList.add(MyPoint(0.0, 0.0))
        return Ellipse(MyPoint(0.0, 0.0), randomRadius1, randomRadius2)
    }

    fun getPointList(): MutableList<MyPoint> {
        return pointList
    }
}