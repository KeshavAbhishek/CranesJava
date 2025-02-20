/**
 * ==========================================================
 * Program Name: TicketBookingSystem
 * Description : 
 * Author      : Keshav Abhishek
 * Created On  : 19-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

package LAB_Problem.Problem9;

public class TicketBookingSystem {
    private static int availableSeats = 3;

    private static void bookSeat(String user) {
        if (availableSeats > 0) {
            availableSeats--;
            System.out.println(user + " booked a seat. Seats left: " + availableSeats);
        } else {
            System.out.println(user + " tried to book a seat, but none are available.");
        }
    }

    public static void main(String[] args) {
        Runnable booker = new Runnable() {
            @Override
            public void run() {
                String threadName = Thread.currentThread().getName();
                try {
                    bookSeat(threadName);
                } catch (Exception e) {
                    System.err.println("An error occurred while booking seat for " + threadName + ": " + e.getMessage());
                }
            }
        };
        Thread user[] = new Thread[4];

        for (int i = 0; i < 4; i++) {
            user[i] = new Thread(booker, "User" + (i + 1));
        }

        for (int i = 0; i < 4; i++) {
            user[i].start();
        }
    }
}