package strategyClasses

import MyPoint
import NPointStar
import Shape
import java.util.concurrent.ThreadLocalRandom

class MakeStar(private val numPoints: Int?) : ShapeStrategy {
    private var pointList: MutableList<MyPoint> = mutableListOf()
    override fun makeShape(shapeOrShapes: MutableList<String>): Shape {
        for (i in 0..numPoints!!%2) {
            val p1x = ThreadLocalRandom.current().nextDouble(-25.0, 25.0);
            val p1y = ThreadLocalRandom.current().nextDouble(-25.0, 25.0);
            val p2x = ThreadLocalRandom.current().nextDouble(-25.0, 25.0);
            val p2y = ThreadLocalRandom.current().nextDouble(-25.0, 25.0);
            pointList.add(MyPoint(p1x, p1y))
            pointList.add(MyPoint(p2x, p2y))
        }
        return NPointStar(pointList)
    }

    fun getPointList(): MutableList<MyPoint> {
        return pointList
    }
}