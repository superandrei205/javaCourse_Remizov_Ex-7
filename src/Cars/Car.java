package Cars;

public class Car {
    private String typeEngine;
    private final int wheels = 4;
    private String manufactoryCountry;


    public Car(String typeEngine, String manufactoryCountry) {
        this.typeEngine = typeEngine;
        this.manufactoryCountry = manufactoryCountry;
    }

    public int getWheels() {
        return wheels;
    }

    public String getManufactoryCountry() {
        return manufactoryCountry;
    }

    public String getTypeEngine() {
        return typeEngine;
    }
    public void drive(){
        System.out.println("Едем");
    }

    public void stop(){
        System.out.println("Стоим");
    }
}
