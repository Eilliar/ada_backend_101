public class Main {

    public static void main(String[] args) {
        Car car = new Car("34741", "blue", "audi", "Q3", 4);
        showVehicleData(car);

    }

    public static void showVehicleData(Vehicle vehicle) {
        vehicle.showData();
    }
}
