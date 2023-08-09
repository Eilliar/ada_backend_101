public class Vehicle {
    private String plate;
    private String color;
    private String brand;
    private String model;

    public Vehicle(String plate, String color, String brand, String model){
        this.plate = plate;
        this.color = color;
        this.brand = brand;
        this.model = model;
    }
    public void showData(){
        System.out.printf("Plate: %s\nBrand: %s\nModel: %s\nColor: %s\n", this.plate, this.brand, this.model, this.color);
    }
}
