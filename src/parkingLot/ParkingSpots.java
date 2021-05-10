package parkingLot;

public class ParkingSpots {
    int id;
    boolean available;

    public enum ParkingType {COMPACT, MEDIUM, LARGE, BIKE, ELECTRIC, HANDICAPPED}

    ;
    ParkingType parkingType;

    public boolean isAvailable() {
        return available;
    }
}
