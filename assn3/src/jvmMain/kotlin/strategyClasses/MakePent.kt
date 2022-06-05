package strategyClasses

import MyPoint
import Pentagon
import Shape
import java.util.concurrent.ThreadLocalRandom

class MakePent: ShapeStrategy {
    private var pointList: MutableList<MyPoint> = mutableListOf()
    override fun makeShape(shapeOrShapes: MutableList<String>): Shape {
        val b1x = ThreadLocalRandom.current().nextDouble(-25.0, 25.0);
        val b1y = ThreadLocalRandom.current().nextDouble(-25.0, 25.0);
        val b2x = ThreadLocalRandom.current().nextDouble(-25.0, 25.0);
        val b2y = ThreadLocalRandom.current().nextDouble(-25.0, 25.0);
        val b3x = ThreadLocalRandom.current().nextDouble(-25.0, 25.0);
        val b3y = ThreadLocalRandom.current().nextDouble(-25.0, 25.0);
        val b4x = ThreadLocalRandom.current().nextDouble(-25.0, 25.0);
        val b4y = ThreadLocalRandom.current().nextDouble(-25.0, 25.0);
        val b5x = ThreadLocalRandom.current().nextDouble(-25.0, 25.0);
        val b5y = ThreadLocalRandom.current().nextDouble(-25.0, 25.0);
        pointList.add(MyPoint(b1x, b1y))
        pointList.add(MyPoint(b2x, b2y))
        pointList.add(MyPoint(b3x, b3y))
        pointList.add(MyPoint(b4x, b4y))
        pointList.add(MyPoint(b5x, b5y))
        return Pentagon(MyPoint(b1x, b1y), MyPoint(b2x, b2y), MyPoint(b3x, b3y), MyPoint(b4x, b4y), MyPoint(b5x, b5y))
    }

    fun getPointList(): MutableList<MyPoint> {
        return pointList
    }
}