package MachingConding.ParkingLot.Models;

import MachingConding.ParkingLot.Strategies.FeesCalculatorStrategy.FeesCalculatorStrategy;

import java.sql.Time;
import java.util.List;

public class BIll {

//    private Id id;
    private Ticket ticket;
    private Time exitTime;
    private double amount;
    private StatusOfBill statusOfBill;
    private List<Payment> payments;
    private Gate gate;
    private Operator operator;
    private FeesCalculatorStrategy feesCalculatorStrategy;


}
