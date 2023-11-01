package MachingConding.ParkingLot.Controller;

import MachingConding.ParkingLot.Models.Ticket;
import MachingConding.ParkingLot.Services.TicketService;
import MachingConding.ParkingLot.dto.IssueTicketRequest;
import MachingConding.ParkingLot.dto.IssueTicketResponse;
import MachingConding.ParkingLot.dto.ResponseStatus;

public class TicketcController {

    private TicketService ticketService;

    public TicketcController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponse issueTicket(IssueTicketRequest request){

        IssueTicketResponse response = new IssueTicketResponse();
        try {
            Ticket ticket = ticketService.issueTicket(request.getVehicleNumber(),
                    request.getVehicleOwnerName(),request.getVehicleType(),request.getGateId()
            );
            response.setTicket(ticket);
            response.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception e){
            response.setResponseStatus(ResponseStatus.FAILURE);
        }

        return response;

    }
}
