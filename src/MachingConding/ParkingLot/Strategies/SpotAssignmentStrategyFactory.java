package MachingConding.ParkingLot.Strategies;

import MachingConding.ParkingLot.Models.SpotAssignmentStrategyType;

public class SpotAssignmentStrategyFactory {

    public static SpotAssignmentStrategy getSpotAssignmentStrategy(SpotAssignmentStrategyType type){
        return new NearestSpotAssignmentStrategy();
    }
}
