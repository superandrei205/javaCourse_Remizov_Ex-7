package Cars;

public class Audi extends Car {
    private double engineCapacity;
    private int seats;

    public Audi(double engineCapacity, int seats, String typeEngine) {
        super(typeEngine, "Germany");
        this.engineCapacity = engineCapacity;
        this.seats = seats;
    }

    public void setSeats(int seats) {
        if (seats < 8 && seats > 1) {
            this.seats = seats;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity > 0) {
            this.engineCapacity = engineCapacity;
        }
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public void drive() {
        System.out.println("Едем очень быстро");
    }
}
