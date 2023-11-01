package MachingConding.ParkingLot.Models;

import java.util.List;

public class ParkingLot {

    private List<ParkingFloor> floor;
    private List<Gate> gate;
    private List<VehicleType> vehicleTypes;
    private ParkingLotStatus parkinglotStatus;
    private SpotAssignmentStrategyType spotAssignmentStrategyType;
    private FeesCalculatorStrategyType feesCalculatorStrategyType;

    public List<ParkingFloor> getFloor() {
        return floor;
    }

    public void setFloor(List<ParkingFloor> floor) {
        this.floor = floor;
    }

    public List<Gate> getGate() {
        return gate;
    }

    public void setGate(List<Gate> gate) {
        this.gate = gate;
    }

    public List<VehicleType> getVehicleTypes() {
        return vehicleTypes;
    }

    public void setVehicleTypes(List<VehicleType> vehicleTypes) {
        this.vehicleTypes = vehicleTypes;
    }

    public ParkingLotStatus getParkinglotStatus() {
        return parkinglotStatus;
    }

    public void setParkinglotStatus(ParkingLotStatus parkinglotStatus) {
        this.parkinglotStatus = parkinglotStatus;
    }

    public SpotAssignmentStrategyType getSpotAssignmentStrategyType() {
        return spotAssignmentStrategyType;
    }

    public void setSpotAssignmentStrategyType(SpotAssignmentStrategyType spotAssignmentStrategyType) {
        this.spotAssignmentStrategyType = spotAssignmentStrategyType;
    }

    public FeesCalculatorStrategyType getFeesCalculatorStrategyType() {
        return feesCalculatorStrategyType;
    }

    public void setFeesCalculatorStrategyType(FeesCalculatorStrategyType feesCalculatorStrategyType) {
        this.feesCalculatorStrategyType = feesCalculatorStrategyType;
    }
}
