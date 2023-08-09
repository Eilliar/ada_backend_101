public class Main {

    public static void main(String[] args) {
        Car car = new Car("34741", "blue", "audi", "Q3", 4);

        Motorbike bike = new Motorbike("34712", "red", "yamaha", "CB150", 150);

        showVehicleData(car);
        showVehicleData(bike);

    }

    public static void showVehicleData(Vehicle vehicle) {
        vehicle.showData();
    }
}
