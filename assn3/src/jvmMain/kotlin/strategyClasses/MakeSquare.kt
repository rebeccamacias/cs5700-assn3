package strategyClasses

import MyPoint
import Shape
import Square
import java.util.concurrent.ThreadLocalRandom

class MakeSquare : ShapeStrategy{
    private var pointList: MutableList<MyPoint> = mutableListOf()
    override fun makeShape(shapeOrShapes: MutableList<String>): Shape {
        val topCoord = ThreadLocalRandom.current().nextDouble(0.5, 25.0);
        val bottomCoord = (-1.0) * topCoord
        pointList.add(MyPoint(topCoord, topCoord))
        pointList.add(MyPoint(bottomCoord, bottomCoord))
        return Square(MyPoint(topCoord, topCoord), MyPoint(bottomCoord, bottomCoord))
    }

}