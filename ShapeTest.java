package HWGroupExercise2;

public abstract class ShapeTest implements Shape6{
    public static void main(String[] args) {
        Shape6 circle = (Shape6) new ShapeCircle(5);
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        Shape6 square = (Shape6) new ShapeSquare(5);
        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
    }
}
