/**
 * ==========================================================
 * Program Name: Emirates
 * Description : Flight Management System
 * Author      : Keshav Abhishek
 * Created On  : 10-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

package LAB_Problem.Problem3;


class FlightTicket{
    String ticketNumber;
    String passengerName;
    double baseFare;

    FlightTicket(){}
    FlightTicket(String ticketNumber, String passengerName, double baseFare){
        this.ticketNumber = ticketNumber;
        this.passengerName = passengerName;
        this.baseFare = baseFare;
    }

    void calculateTotalFare(){
        System.out.println("Ticket number: " + ticketNumber);
        System.out.println("Passenger name: " + passengerName);
    }
}

class EconomyTicket extends FlightTicket{
    EconomyTicket(){}
    EconomyTicket(String ticketNumber, String passengerName, double baseFare){
        super(ticketNumber, passengerName, baseFare);
    }

    @Override
    void calculateTotalFare(){
        super.calculateTotalFare();
        baseFare = baseFare * 0.9;
        System.out.println("Economy Ticket Price = " + baseFare + "\n");
    }
}


class BusinessTicket extends FlightTicket{
    BusinessTicket(){}
    BusinessTicket(String ticketNumber, String passengerName, double baseFare){
        super(ticketNumber, passengerName, baseFare);
    }

    @Override
    void calculateTotalFare(){
        super.calculateTotalFare();
        baseFare = baseFare * 1.2;
        System.out.println("Busniess Ticket Price = " + baseFare + "\n");
    }
}


class FirstClassTicket extends FlightTicket{
    FirstClassTicket(){}
    FirstClassTicket(String ticketNumber, String passengerName, double baseFare){
        super(ticketNumber, passengerName, baseFare);
    }

    @Override
    void calculateTotalFare(){
        super.calculateTotalFare();
        baseFare = baseFare * 1.5;
        System.out.println("FirstClass Ticket Price = " + baseFare + "\n");
    }
}

public class Emirates {
    public static void main(String[] args) {
        EconomyTicket E = new EconomyTicket("E1001", "Hema Parida", 6000);
        E.calculateTotalFare();

        BusinessTicket B = new BusinessTicket("B1002", "Santosh", 12000);
        B.calculateTotalFare();

        FirstClassTicket F = new FirstClassTicket("F1003", "Aman Gucci", 120000);
        F.calculateTotalFare();
    }
}

