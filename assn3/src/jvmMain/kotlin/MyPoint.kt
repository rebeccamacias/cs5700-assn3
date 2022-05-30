class MyPoint (private var x: Double, private var y: Double) {

    fun getX(): Double {
        return x
    }

    fun getY(): Double {
        return y
    }

    fun clonePoint(): MyPoint {
        return MyPoint(x, y)
    }

    fun movePoint(xDelta: Double, yDelta: Double) {
        x += xDelta
        y += yDelta
    }
}