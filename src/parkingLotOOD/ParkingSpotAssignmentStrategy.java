package parkingLotOOD;

public interface ParkingSpotAssignmentStrategy {
    ParkingSpot findAvailableSpot(VehicleEntryEvent vehicle) throws SpotNotAvailableException;
}
