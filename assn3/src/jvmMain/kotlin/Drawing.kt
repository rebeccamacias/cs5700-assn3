import androidx.compose.runtime.mutableStateListOf
import java.io.File
import kotlin.system.exitProcess

class Drawing {
    val shapes = mutableStateListOf<Shape>()

    fun addShape(shape: Shape) {
        shapes.add(shape)
    }

    fun endDrawing() {
        var txtFile = File("drawing.txt")
        var csvFile = File("drawing.csv")
        var fos = txtFile.outputStream()
        var csvFos = csvFile.outputStream()
        for (shape in shapes) {
            fos.write(shape.toString().toByteArray())
            fos.write("\n".toByteArray())
            csvFos.write(shape.toString().toByteArray())
            csvFos.write(",".toByteArray())
        }
        fos.close()
        csvFos.close()
        exitProcess(0)
    }
}