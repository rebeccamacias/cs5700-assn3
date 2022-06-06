package Commands

import Drawing
import androidx.compose.ui.geometry.Offset

interface Command {
    fun execute(drawing: Drawing, offset: Offset)
}