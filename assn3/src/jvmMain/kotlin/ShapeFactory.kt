import strategyClasses.*
import java.util.*
import java.util.concurrent.ThreadLocalRandom

class ShapeFactory private constructor(){
    companion object {
        private var shapes = mutableListOf<Shape>()
        private var points = mutableListOf<MyPoint>()

        fun getShapes(): List<Shape> {
            return shapes
        }

        fun getPoints(): List<MyPoint> {
            return points
        }

        fun addShape(shape: String, numPoints : Int?) {
            if (shape == "circle") {
                val randomRadius = ThreadLocalRandom.current().nextDouble(1.0, 25.0);
                val circle = Circle(MyPoint(0.0, 0.0), randomRadius)
                shapes.add(circle)
                points.add(MyPoint(0.0, 0.0))

            } else if (shape == "square") {
                val topLeftCoord = ThreadLocalRandom.current().nextDouble(0.5, 25.0);
                val bottomRightCoord = (-1.0) * topLeftCoord
                shapes.add(Square(MyPoint(topLeftCoord, topLeftCoord), MyPoint(bottomRightCoord, bottomRightCoord)))
                points.add(MyPoint(topLeftCoord, topLeftCoord))
                points.add(MyPoint(bottomRightCoord, bottomRightCoord))
            } else if (shape == "triangle") {
                var stringList = mutableListOf<String>()
                val makeTri = MakeTriangle()
                shapes.add(makeTri.makeShape(stringList))

            } else if (shape == "rectangle") {
                var stringList = mutableListOf<String>()
                val makeRect = MakeRectangle()
                shapes.add(makeRect.makeShape(stringList))
            } else if (shape == "ellipse") {
                var stringList = mutableListOf<String>()
                val makeEllipse = MakeEllipse()
                shapes.add(makeEllipse.makeShape(stringList))
            } else if (shape == "pentagon") {
                var stringList = mutableListOf<String>()
                val makePent = MakePent()
                shapes.add(makePent.makeShape(stringList))
            } else if (shape == "npointstar") {
                var stringList = mutableListOf<String>()
                val makeStar = MakeStar(numPoints)
                shapes.add(makeStar.makeShape(stringList))
            }
            throw IllegalArgumentException("Invalid shape") //TODO: CHANGE LATER
        }

        fun clearShapes() {
            shapes.clear()
        }
    }



}