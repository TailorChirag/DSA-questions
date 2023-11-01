package MachingConding.ParkingLot.Models;

import java.util.List;

public class ParkingSpot {

    private List<VehicleType> supportedVehicleType;
    private ParkingSpotStatus parkingSlotStatus;
    private int spotnumber;
    private ParkingFloor parkingFloor;

    public ParkingSpotStatus getParkingSlotStatus() {
        return parkingSlotStatus;
    }

    public void setParkingSlotStatus(ParkingSpotStatus parkingSlotStatus) {
        this.parkingSlotStatus = parkingSlotStatus;
    }

    public List<VehicleType> getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(List<VehicleType> supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }

    public int getSpotnumber() {
        return spotnumber;
    }

    public void setSpotnumber(int spotnumber) {
        this.spotnumber = spotnumber;
    }

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }
}

