package Cars;

public class Seat extends Car {
    private String color;
    public final int seats = 4;

    public Seat(String color, String typeEngine) {
        super(typeEngine, "Spain");
        this.color = color;
    }
}
