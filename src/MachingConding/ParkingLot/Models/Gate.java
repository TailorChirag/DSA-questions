package MachingConding.ParkingLot.Models;

public class Gate {

//    private Id id
    private  TypeOfGates typeOfGates;
    private int Number;
    private Operator operator;
    private GateStatus gateStatus;

    public TypeOfGates getTypeOfGates() {
        return typeOfGates;
    }

    public void setTypeOfGates(TypeOfGates typeOfGates) {
        this.typeOfGates = typeOfGates;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }
}
