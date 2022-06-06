import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CompositeShapeTest {

    @Test
    fun getShapeList() {
        val points = mutableListOf(MyPoint(0.0, 0.0), MyPoint(1.0, 1.0), MyPoint(2.0, 2.0), MyPoint(3.0, 3.0))
        val shapes = mutableListOf(Triangle(MyPoint(-1.0, 0.0), MyPoint(1.0, 0.0), MyPoint(0.0, 1.0)), Rectangle(MyPoint(-1.0, 0.0), MyPoint(1.0, -1.0)))
        val comp = CompositeShape(points, shapes)
        assertEquals(2, comp.getShapeList().size)
    }

    @Test
    fun getArea() {
        val points = mutableListOf(MyPoint(0.0, 0.0), MyPoint(1.0, 1.0), MyPoint(2.0, 2.0), MyPoint(3.0, 3.0))
        val shapes = mutableListOf(Triangle(MyPoint(-1.0, 0.0), MyPoint(1.0, 0.0), MyPoint(0.0, 1.0)), Rectangle(MyPoint(-1.0, 0.0), MyPoint(1.0, -1.0)))
        val comp = CompositeShape(points, shapes)
        assertEquals(3.0, comp.getArea())
    }

    @Test
    fun moveShape() {
        val points = mutableListOf(MyPoint(0.0, 0.0), MyPoint(1.0, 1.0), MyPoint(2.0, 2.0), MyPoint(3.0, 3.0))
        val shapes = mutableListOf(Triangle(MyPoint(-1.0, 0.0), MyPoint(1.0, 0.0), MyPoint(0.0, 1.0)), Rectangle(MyPoint(-1.0, 0.0), MyPoint(1.0, -1.0)))
        val comp = CompositeShape(points, shapes)
        comp.moveShape(1.0, 1.0)
        assertNotNull(comp.getShapeList())
    }
}