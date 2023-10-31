package MachingConding.ParkingLot.Models;

import MachingConding.ParkingLot.Strategies.AllocationStrategy.AllocationStrategy;
import MachingConding.ParkingLot.Strategies.PaymentStrategy.PaymentStrategy;

public class ParkingLot {
//    private Id id;
    private Floor floor;
    private Gate gate;
    private PaymentStrategy paymentStrategy;
    private AllocationStrategy allocationStrategy;
    private TypeOfVehicles typeOfVehicles;

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public AllocationStrategy getAllocationStrategy() {
        return allocationStrategy;
    }

    public void setAllocationStrategy(AllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    public TypeOfVehicles getTypeOfVehicles() {
        return typeOfVehicles;
    }

    public void setTypeOfVehicles(TypeOfVehicles typeOfVehicles) {
        this.typeOfVehicles = typeOfVehicles;
    }
}
