import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope

class NPointStar(userList: List<MyPoint>) : Shape() {
    override var pointList: MutableList<MyPoint> = mutableListOf()
    private var lineList: MutableList<Line> = mutableListOf()

    init {
        pointList.addAll(userList)
        runChecks()
        makeLineList()
    }

    override fun getArea(): Double {
        var area = 0.0
        for (line in lineList) {
            area += line.getArea()
        }
        return area
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        for (point in pointList) {
            point.movePoint(xDelta, yDelta)
        }
    }

    override fun draw(scope: DrawScope) {
        TODO("Not implemented")
    }

    fun getLineList(): MutableList<Line> {
        return lineList
    }

    private fun runChecks() {
        if (pointList.size < 4) {
            throw IllegalArgumentException("NPointStar must have at least 4 points")
        }
        if (pointList.size % 2 != 0) {
            throw IllegalArgumentException("NPointStar must have an even number of points")
        }
    }

    private fun makeLineList() {
        for (i in 0 until pointList.size) {

            if (i % 2 == 0) {
                lineList.add(Line(pointList[i], pointList[i + 1]))
            }
        }
    }
}