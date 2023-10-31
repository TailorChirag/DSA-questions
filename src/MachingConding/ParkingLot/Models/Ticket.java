package MachingConding.ParkingLot.Models;

import java.sql.Time;

public class Ticket {

//    private ID id;
    private int numberOfTickets;
    private Vehicle vehicle;
    private Time entryTime;
    private ParkingSlot parkingSlot;
    private Operator operator;
    private Gate gate;

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Time getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Time entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
