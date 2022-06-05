package strategyClasses

import Shape

interface ShapeStrategy {
    abstract fun makeShape(shapeOrShapes: MutableList<String>): Shape
}