package strategyClasses

import MyPoint
import Rectangle
import Shape
import java.util.concurrent.ThreadLocalRandom

class MakeRectangle : ShapeStrategy{
    private var pointList: MutableList<MyPoint> = mutableListOf()
    override fun makeShape(shapeOrShapes: MutableList<String>): Shape {
        val negativeCoord = ThreadLocalRandom.current().nextDouble(-25.0, 0.5);
        val positiveCoord = ThreadLocalRandom.current().nextDouble(0.0, 25.0);
        pointList.add(MyPoint(negativeCoord, negativeCoord))
        pointList.add(MyPoint(positiveCoord, negativeCoord))
        return  Rectangle(MyPoint(negativeCoord, negativeCoord), MyPoint(positiveCoord, positiveCoord))
    }

    fun getPointList(): MutableList<MyPoint> {
        return pointList
    }
}