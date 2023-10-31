package MachingConding.ParkingLot.Models;

public class Vehicle {

//    private ID id;
    private int number;
    private TypeOfVehicles typeOfVehicles;
    private String nameOfOwner;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public TypeOfVehicles getTypeOfVehicles() {
        return typeOfVehicles;
    }

    public void setTypeOfVehicles(TypeOfVehicles typeOfVehicles) {
        this.typeOfVehicles = typeOfVehicles;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }
}
