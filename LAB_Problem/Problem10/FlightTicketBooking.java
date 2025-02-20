package LAB_Problem.Problem10;

/**
 * ==========================================================
 * Program Name: FlightTicketBooking
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 20-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

class Ticket implements Runnable{
    public String ticket[] = new String[]{"A1", "A2", "A3"};
    public boolean ticketAvailable[] = new boolean[]{true, true, true};
    public String bookedBy[] = new String[ticket.length];
    
    public synchronized void bookTkt(){
        try {
            String[] threadInfo = Thread.currentThread().getName().split("_");
            String userName = threadInfo[0];
            String seatNumber = threadInfo[1];
            boolean seatFound = false;
            for(int i = 0; i < ticket.length; i++){
                if(ticket[i].equals(seatNumber)){
                    seatFound = true;
                    if(ticketAvailable[i]){
                        System.out.println("Ticket booked by: " + userName + " Seat number: " + seatNumber);
                        ticketAvailable[i] = false;
                        bookedBy[i] = userName;
                    } else {
                        System.out.println("Error: Seat " + seatNumber + " is already booked by " + bookedBy[i] + ".");
                    }
                    break;
                }
            }
            if (!seatFound) {
                System.out.println("Error: Seat " + seatNumber + " does not exist.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void run(){
        bookTkt();
    }
}

public class FlightTicketBooking {
    public static void main(String[] args) {
        Ticket T = new Ticket();
        Thread t1 = new Thread(T, "User 1_A1");
        Thread t2 = new Thread(T, "User 2_A1");
        Thread t3 = new Thread(T, "User 3_A2");
        Thread t4 = new Thread(T, "User 4_A2");
        Thread t5 = new Thread(T, "User 5_A3");
        Thread t6 = new Thread(T, "User 6_A3");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}