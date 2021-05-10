package parkingLotOOD;

import java.util.Set;

public class ParkingSpot {
    private int spotNo;
    private int level;
    private Vehicle vehicle;
    private int distance;
    private Set<VehicleType> suitableFor;

    public int getSpotNo() {
        return spotNo;
    }

    public void setSpotNo(int spotNo) {
        this.spotNo = spotNo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void vacate() {
        this.vehicle = null;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public Set<VehicleType> getSuitableFor() {
        return suitableFor;
    }

    public void setSuitableFor(Set<VehicleType> suitableFor) {
        this.suitableFor = suitableFor;
    }
}
