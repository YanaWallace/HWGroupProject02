package HWGroupExercise2;

public class Car8Truck extends Car8 {
    int weight;

    public double calculateSalePrice() {
        if (weight > 2000) {
            return carPrice * 0.9;
        } else {
            return carPrice * 0.8;
        }
    }

}
