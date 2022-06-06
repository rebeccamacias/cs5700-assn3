package Commands

import Drawing
import Line
import MyPoint
import androidx.compose.ui.geometry.Offset

class DrawLineCommand : Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        drawing.addShape(Line(MyPoint(offset.x.toDouble(), offset.y.toDouble()), MyPoint(offset.x.toDouble() + 100, offset.y.toDouble() + 100)))
    }
}