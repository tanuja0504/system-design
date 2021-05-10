package parkingLot;

import java.util.List;

class Address {
    String city;
    String country;
    String street;
    String streetAddress;
    int zip;
}

public class ParkingLot {
    int id;
    String name;
    Address address;
    List<EntrancePanel> entrancePanelList;
    List<ExitPanel> exitPanelList;

    List<ParkingFloor> floor;

    public boolean isFull() {
        int count = 0;
        for (ParkingFloor p : floor) {
            if (p.freeSlot()) {
                count++;
            }
        }
        return (count > 0);
    }

    public ParkingTicket getTicket(ParkingTicket p) {
        //Set Attributes of ticket
        return p;
    }

    public int capacity(int current, boolean isEntry) {
        //-1 or +1 based on entry or exit
        return current;
    }

}
