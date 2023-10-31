package MachingConding.ParkingLot.Models;

public class ParkingSlot {

//    private Id id;
    private ParkingSlotStatus parkingSlotStatus;
    private TypeOfVehicles supportedTypeOfVehicles;
    private int number;
    private Floor floor;

    public ParkingSlotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSlotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public TypeOfVehicles getSupportedTypeOfVehicles() {
        return supportedTypeOfVehicles;
    }

    public void setSupportedTypeOfVehicles(TypeOfVehicles supportedTypeOfVehicles) {
        this.supportedTypeOfVehicles = supportedTypeOfVehicles;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }
}

