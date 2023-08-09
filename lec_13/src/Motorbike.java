public class Motorbike extends Vehicle {

    private int engineCapacity;

    public Motorbike(String plate, String color, String brand, String model, int engineCapacity){
        super(plate, color, brand, model);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void showData(){
        super.showData();
        System.out.printf("Engine capacity: %d", this.engineCapacity);
    }
}
