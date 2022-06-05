package strategyClasses

import MyPoint
import Shape
import Triangle
import java.util.concurrent.ThreadLocalRandom

class MakeTriangle : ShapeStrategy {
    private var pointList: MutableList<MyPoint> = mutableListOf()
    override fun makeShape(shapeOrShapes: MutableList<String>): Shape {
        val b1x = ThreadLocalRandom.current().nextDouble(-25.0, -0.5);
        val b1y = ThreadLocalRandom.current().nextDouble(-25.0, 0.5);
        val b2x = ThreadLocalRandom.current().nextDouble(-0.5, 0.5);
        val b2y = ThreadLocalRandom.current().nextDouble(0.5, 25.0);
        val b3x = ThreadLocalRandom.current().nextDouble(0.5, 25.0);
        val b3y = ThreadLocalRandom.current().nextDouble(-25.0, 0.5);
        pointList.add(MyPoint(b1x, b1y))
        pointList.add(MyPoint(b2x, b2y))
        pointList.add(MyPoint(b3x, b3y))
        return Triangle(MyPoint(b1x, b1y), MyPoint(b2x, b2y), MyPoint(b3x, b3y))
    }

    fun getPointList(): MutableList<MyPoint> {
        return pointList
    }
}