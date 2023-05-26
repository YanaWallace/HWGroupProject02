package HWGroupExercise2;

public class CarTest8 {
    public static void main(String[] args) {
        Car8Sedan sedan = new Car8Sedan();
        sedan.carPrice = 10000;
        sedan.color = "red";
        sedan.length = 25;

        System.out.println("Sedan sale price: " + sedan.calculateSalePrice());

        Car8Truck truck = new Car8Truck();
        truck.carPrice = 20000;
        truck.color = "blue";
        truck.weight = 3000;

        System.out.println("Truck sale price: " + truck.calculateSalePrice());
    }
}
