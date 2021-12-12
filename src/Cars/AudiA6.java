package Cars;

public class AudiA6 extends Audi {
    private int price;

    public AudiA6(int price, double engineCapacity, String typeEngine) {
        super(engineCapacity, 4, typeEngine);
        this.price = price;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public int getPrice() {
        return price;
    }
}
