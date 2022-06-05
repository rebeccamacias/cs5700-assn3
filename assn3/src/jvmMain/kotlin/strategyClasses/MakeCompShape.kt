package strategyClasses

import CompositeShape
import Shape
import ShapeFactory

class MakeCompShape(private val numPoints: Int?) : ShapeStrategy {
    override fun makeShape(shapeOrShapes: MutableList<String>): Shape {
        for (shape in shapeOrShapes) {
            ShapeFactory.addShape(shape, numPoints)
        }
        return CompositeShape(ShapeFactory.getPoints(), ShapeFactory.getShapes())
    }

}