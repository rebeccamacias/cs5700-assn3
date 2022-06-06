package Commands

import Drawing
import MyPoint
import Rectangle
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size

class DrawRectangleCommand : Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        drawing.addShape(Rectangle(MyPoint(offset.x.toDouble(), offset.y.toDouble()), MyPoint(offset.x.toDouble() + 100, offset.y.toDouble() + 50)))
    }
}