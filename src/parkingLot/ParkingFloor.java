package parkingLot;

import java.util.List;

public class ParkingFloor {
    int id;
    int level;
    List<ParkingSpots> parkingSpotsList;

    public void addParkingSpots() {

    }

    public void displayBoard(DisplayBoard db) {

    }

    public void assignVehicleToSpot() {

    }

    public boolean freeSlot() {
        int count = 0;
        for (ParkingSpots p : parkingSpotsList) {
            if (p.isAvailable()) {
                count++;
            }
        }
        return (count > 0);
    }
}
