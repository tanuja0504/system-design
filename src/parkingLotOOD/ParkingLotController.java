package parkingLotOOD;

public class ParkingLotController {

    //@AutoWire or configured by properties 
    private long waitDuration;

    private ParkingLot parkingLot;

    public void enter(VehicleEntryEvent vehicleEntryEvent) throws SpotNotAvailableException, IllegitimateVehicleException, InterruptedException { // app event
        try {
            parkingLot.processEnterEvent(vehicleEntryEvent);
        } catch (SpotNotAvailableException e) {
//            displayWaitMessage(e);
            //very primitive retry mechanism..substitute your own here
            //or we can use wait-notify
            Thread.sleep(waitDuration);
            enter(vehicleEntryEvent);
        } catch (IllegitimateVehicleException e) {
            displayIntoleranceMessage(e);
        }
    }

    private void displayIntoleranceMessage(IllegitimateVehicleException e) {
    }

    public void exit(VehicleExitEvent vehicleExitEvent) { // app event
        ParkingBill parkingBill = parkingLot.processExitEvent(vehicleExitEvent);
        printParkingBill(parkingBill);
    }

    private void printParkingBill(ParkingBill parkingBill) {
    }


}
