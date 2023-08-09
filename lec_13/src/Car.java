public class Car extends Vehicle{

    private int numDoors;

    public Car(String plate, String color, String brand, String model, int numDoors){
        super(plate, color, brand, model);
        this.numDoors = numDoors;
    }

    @Override
    public void showData(){
        super.showData();
        System.out.printf("Number of Doors: %d", this.numDoors);
    }
}
