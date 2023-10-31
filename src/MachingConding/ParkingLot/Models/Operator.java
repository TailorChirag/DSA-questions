package MachingConding.ParkingLot.Models;

public class Operator {

//    private ID id;
    private String name;
    private Gate gate;
    private String empolyeeId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public String getEmpolyeeId() {
        return empolyeeId;
    }

    public void setEmpolyeeId(String empolyeeId) {
        this.empolyeeId = empolyeeId;
    }
}
