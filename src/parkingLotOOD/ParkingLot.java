package parkingLotOOD;

import java.util.List;

public class ParkingLot {
    private String name;
    private String address;
    private List<ParkingSpot> parkingSpots; // has all the parking sports
    private ParkingSpotAssignmentStrategy parkingSpotAssignmentStrategy;
    private VehicleValidationStrategy vehicleValidationStrategy;
    private BillService billService;

    public boolean isFull() {
        return false;
    }

    public boolean isOpen() {
        return true;
    }

    public ParkingSpot processEnterEvent(VehicleEntryEvent vehicleEntryEvent) throws SpotNotAvailableException, IllegitimateVehicleException {
        vehicleValidationStrategy.validate(vehicleEntryEvent);// eg. only parking log is on open time 
        ParkingSpot vacantParkingSpot = findAvailableSpot(vehicleEntryEvent);
        Vehicle vehicle = vehicleEntryEvent.getVehicle();

        synchronized (vacantParkingSpot) { //so that no two vehicles are assigned the same spot
            if (vacantParkingSpot.isAvailable()) {
                //..associate vehicle with vacantParkingSpot. Update internal DSes.	
                vehicle.park(vacantParkingSpot);
                vacantParkingSpot.parkVehicle(vehicle);
                billService.startBilling(vehicleEntryEvent);
            } else {
                //retry
                return processEnterEvent(vehicleEntryEvent);
            }
        }

        return vacantParkingSpot;
    }

    public ParkingBill processExitEvent(VehicleExitEvent vehicleExitEvent) {
        removeVehicle(vehicleExitEvent.getVehicle());
        return billService.calculateBill(vehicleExitEvent);
    }

    private ParkingSpot findAvailableSpot(VehicleEntryEvent vehicleEntryEvent) throws SpotNotAvailableException {
        //using specific strategy to find available parkingSpot 
        return parkingSpotAssignmentStrategy.findAvailableSpot(vehicleEntryEvent);
    }

    public void removeVehicle(Vehicle vehicle) {
        //collect parkingSpot
        vehicle.getParkingSpot().vacate();
        vehicle.leave();
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }


}
