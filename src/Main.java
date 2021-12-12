import Cars.*;

public class Main {
    public static void main(String[] args) {
        AudiA6 a6 = new AudiA6(1000, 3.0, "disiel");
        System.out.println(a6.getWheels());
        System.out.println(a6.getTypeEngine());
        System.out.println(a6.getPrice());
        System.out.println(a6.getEngineCapacity());
        System.out.println(a6.getSeats());
        System.out.println(a6.getManufactoryCountry());
        a6.setPrice(-1231);
        a6.setSeats(9);
        a6.setEngineCapacity(-0.3);
        System.out.println(a6.getPrice());
        System.out.println(a6.getSeats());
        System.out.println(a6.getEngineCapacity());
        a6.setPrice(9999);
        a6.setSeats(2);
        a6.setEngineCapacity(12);
        System.out.println(a6.getPrice());
        System.out.println(a6.getSeats());
        System.out.println(a6.getEngineCapacity());
        a6.drive();

        Lada priora = new Lada(false, 4, "benzin");
        priora.makeRRR();
        priora.drive();
        System.out.println(priora.quality);
        Seat seat = new Seat("red", "benzin");
        System.out.println(seat.seats);
    }
}
