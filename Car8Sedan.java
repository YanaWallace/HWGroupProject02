package HWGroupExercise2;

public class Car8Sedan extends Car8{
    int length;

    public double calculateSalePrice() {
        if (length > 20) {
            return carPrice * 0.95;
        } else {
            return carPrice * 0.9;
        }
    }
}
