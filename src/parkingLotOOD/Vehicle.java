package parkingLotOOD;

import java.util.Date;

public abstract class Vehicle {
    protected String plateNo;
    protected Date enterTime;
    protected Date leaveTime;
    protected ParkingSpot parkingSpot;

    public abstract VehicleType getVehicleType();

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }

    public Date getEnterTime() {
        return enterTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void park(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
        this.enterTime = new Date();
    }

    public void leave() {
        this.parkingSpot = null;
        this.leaveTime = new Date();
    }


}
