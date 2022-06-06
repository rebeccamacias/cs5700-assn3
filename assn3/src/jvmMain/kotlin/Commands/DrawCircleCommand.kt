package Commands

import Circle
import Drawing
import MyPoint
import androidx.compose.ui.geometry.Offset

class DrawCircleCommand: Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        drawing.addShape(Circle(MyPoint(offset.x.toDouble(), offset.y.toDouble()), 80.0))
    }
}