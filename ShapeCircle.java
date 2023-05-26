package HWGroupExercise2;

public class ShapeCircle implements Shape6 {
    private double radius;

    public ShapeCircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

}
