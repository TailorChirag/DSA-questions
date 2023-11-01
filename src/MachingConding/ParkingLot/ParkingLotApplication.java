package MachingConding.ParkingLot;

import MachingConding.ParkingLot.Controller.TicketcController;
import MachingConding.ParkingLot.Repositories.GateRepository;
import MachingConding.ParkingLot.Repositories.ParkingLotRepository;
import MachingConding.ParkingLot.Repositories.TicketRepository;
import MachingConding.ParkingLot.Repositories.VehicleRepository;
import MachingConding.ParkingLot.Services.TicketService;

public class ParkingLotApplication {
    public static void main(String[] args) {
        TicketRepository ticketRepository =  new TicketRepository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        GateRepository gateRepository = new GateRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(gateRepository,
                vehicleRepository, parkingLotRepository,ticketRepository);

        TicketcController ticketcController = new TicketcController(ticketService);
    }
}
