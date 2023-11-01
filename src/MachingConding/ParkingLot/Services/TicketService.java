package MachingConding.ParkingLot.Services;

import MachingConding.ParkingLot.Exceptions.GateNotFoundException;
import MachingConding.ParkingLot.Models.*;
import MachingConding.ParkingLot.Repositories.GateRepository;
import MachingConding.ParkingLot.Repositories.ParkingLotRepository;
import MachingConding.ParkingLot.Repositories.TicketRepository;
import MachingConding.ParkingLot.Repositories.VehicleRepository;
import MachingConding.ParkingLot.Strategies.SpotAssignmentStrategy;
import MachingConding.ParkingLot.Strategies.SpotAssignmentStrategyFactory;

import java.util.Date;
import java.util.Optional;
import java.util.Random;

public class TicketService {

    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRepository = vehicleRepository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(String vehicleNumber,
                              String vehicleOwnerName,
                              VehicleType vehicleType,
                              Long gateID) throws GateNotFoundException {


        Ticket ticket = new Ticket();
        ticket.setEntryTime((java.sql.Date) new Date());

        Optional<Gate> optionalGate = gateRepository.findMyGateID(gateID);
        if(optionalGate.isEmpty()) {
            throw new GateNotFoundException();
        }
        Gate gate = optionalGate.get();
        ticket.setGate(gate);

        Vehicle savedVehicle;
        Optional<Vehicle> optionalVehicle = vehicleRepository.findByVehicleNumber(vehicleNumber);
        if(!optionalGate.isPresent()){
            Vehicle vehicle = new Vehicle();
            vehicle.setVehicleType(vehicleType);
            vehicle.setNumber(vehicleNumber);
            vehicle.setOwnerName(vehicleOwnerName);
            savedVehicle = vehicleRepository.saveVehicle(vehicle);
        }else {
            savedVehicle = optionalVehicle.get();
        }
        ticket.setVehicle(savedVehicle);
        ticket.setGeneratedBy(gate.getOperator());
        ticket.setNumber("Ticket No " + new Random().nextInt());

        SpotAssignmentStrategyType spotAssignmentStrategyType=
                parkingLotRepository.findByGate(gate).getSpotAssignmentStrategyType();
        SpotAssignmentStrategy strategy =
                SpotAssignmentStrategyFactory.getSpotAssignmentStrategy(spotAssignmentStrategyType);
        ticket.setParkingSpot(strategy.getSpot(gate,vehicleType));
        ticketRepository.savedTicket(ticket);
        return ticket;
    }
}
