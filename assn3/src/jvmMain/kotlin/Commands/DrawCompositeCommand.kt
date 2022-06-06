package Commands

import Circle
import CompositeShape
import Drawing
import MyPoint
import Shape
import androidx.compose.ui.geometry.Offset

class DrawCompositeCommand : Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        var shapeList: MutableList<Shape> = mutableListOf()
        var pointList: MutableList<MyPoint> = mutableListOf()
        pointList.add(MyPoint(offset.x.toDouble(), offset.y.toDouble()))
        pointList.add(MyPoint(offset.x.toDouble() - 100, offset.y.toDouble() + 200))
        pointList.add(MyPoint(offset.x.toDouble() + 100, offset.y.toDouble() + 200))
        shapeList.add(Circle(MyPoint(offset.x.toDouble(), offset.y.toDouble()), 100.0))
        shapeList.add(Circle(MyPoint(offset.x.toDouble() - 100.0, offset.y.toDouble() - 100.0), 70.0))
        shapeList.add(Circle(MyPoint(offset.x.toDouble() + 100.0, offset.y.toDouble() - 100.0), 70.0))
        drawing.addShape(CompositeShape(pointList, shapeList))
    }
}