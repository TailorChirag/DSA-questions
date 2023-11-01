package MachingConding.ParkingLot.Strategies;

import MachingConding.ParkingLot.Models.Gate;
import MachingConding.ParkingLot.Models.ParkingSpot;
import MachingConding.ParkingLot.Models.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot getSpot(Gate gate, VehicleType vehicleType);
}
