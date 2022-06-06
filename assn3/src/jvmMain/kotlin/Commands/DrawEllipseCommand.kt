package Commands

import Drawing
import Ellipse
import MyPoint
import androidx.compose.ui.geometry.Offset

class DrawEllipseCommand : Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        drawing.addShape(Ellipse(MyPoint(offset.x.toDouble(), offset.y.toDouble()), 20.0, 10.0))
    }
}