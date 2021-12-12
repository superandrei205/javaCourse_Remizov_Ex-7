package Cars;

public class Lada extends Car {
    public final boolean quality;
    private int seats;

    public Lada(boolean quality, int seats, String typeEngine) {
        super(typeEngine, "Russia");
        this.quality = quality;
        this.seats = seats;
    }

    public void makeRRR (){
        System.out.println("RRRRRR");
    }

    @Override
    public void drive() {
        super.stop();
    }

}
