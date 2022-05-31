class NPointStar() : Shape() {
    override var pointList: MutableList<MyPoint> = mutableListOf()
    override fun getArea(): Double {
        TODO("Not yet implemented")
    }

    override fun moveShape(xDelta: Double, yDelta: Double) {
        for (point in pointList) {
            point.movePoint(xDelta, yDelta)
        }
    }
}