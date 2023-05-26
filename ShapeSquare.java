package HWGroupExercise2;

public class ShapeSquare implements Shape6{
    private double side;

    public ShapeSquare(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
