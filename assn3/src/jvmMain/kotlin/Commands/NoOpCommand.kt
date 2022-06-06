package Commands

import Drawing
import androidx.compose.ui.geometry.Offset

class NoOpCommand : Command {
    override fun execute(drawing: Drawing, offset: Offset) {
        // No-op
    }
}