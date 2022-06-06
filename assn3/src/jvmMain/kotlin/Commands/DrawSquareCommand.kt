package Commands

import Drawing
import MyPoint
import Square
import androidx.compose.ui.geometry.Offset

class DrawSquareCommand : Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        drawing.addShape(Square(MyPoint(offset.x.toDouble(), offset.y.toDouble()), MyPoint(
            x = offset.x.toDouble() + 100,
            y = offset.y.toDouble() + 100
        )))
    }
}