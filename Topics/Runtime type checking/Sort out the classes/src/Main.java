import java.util.Arrays;
import java.util.List;

class Sort {
    public static void sortShapes(Shape[] array,
                                  List<Shape> shapes,
                                  List<Polygon> polygons,
                                  List<Square> squares,
                                  List<Circle> circles) {
        // write your code here
        for (Shape shape : array) {
            if (shape instanceof Square square) {
                squares.add(square);
            } else if (shape instanceof Circle circle) {
                circles.add(circle);
            } else if (shape instanceof Polygon polygon) {
                polygons.add(polygon);
            } else {
                shapes.add(shape);
            }
        }
    }
}

//Don't change classes below
class Shape { }
class Polygon extends Shape { }
class Square extends Polygon { }
class Circle extends Shape { }