import Commands.*
import androidx.compose.ui.geometry.Offset
import java.util.*

class TestViewHelper(val drawing: Drawing) {
    private var command: Command = NoOpCommand()

    fun executeCommand(offset: Offset){
        command.execute(drawing, offset)
    }

    fun setCommand(command: Command){
        this.command = command
    }
}