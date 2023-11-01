package MachingConding.ParkingLot.Models;

import java.sql.Date;
import java.sql.Time;

public class Ticket {

    private String number;
    private Vehicle vehicle;
    private Date entryTime;
    private ParkingSpot parkingSpot;
    private Operator generatedBy;
    private Gate gate;

    public String getnumber() {
        return number;
    }

    public void setnumber(String number) {
        this.number = number;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public ParkingSpot getparkingSpot() {
        return parkingSpot;
    }

    public void setparkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Operator getOperator() {
        return generatedBy;
    }

    public void setOperator(Operator generatedBy) {
        this.generatedBy = generatedBy;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }
}
