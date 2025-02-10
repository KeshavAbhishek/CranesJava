/**
 * ==========================================================
 * Program Name: MovieTicketSystem
 * Description : Moive Booking System
 * Author      : Keshav Abhishek
 * Created On  : 10-02-2025
 * Organization: C.V. Raman Global University
 * ==========================================================
 * Copyright (c) 2025, All rights reserved.
 * ==========================================================
 */

package LAB_Problem.Problem3;

class MovieTicket {
    String ticketId;
    String movieName;
    double basePrice;

    MovieTicket(String ticketId, String movieName, double basePrice) {
        this.ticketId = ticketId;
        this.movieName = movieName;
        this.basePrice = basePrice;
    }

    double calculateFinalPrice() {
        return basePrice;
    }

    void displayTicketDetails() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Movie Name: " + movieName);
        System.out.println("Final Price: " + calculateFinalPrice());
    }
}

class StandardTicket extends MovieTicket {
    StandardTicket(String ticketId, String movieName, double basePrice) {
        super(ticketId, movieName, basePrice);
    }
}

class PremiumTicket extends MovieTicket {
    PremiumTicket(String ticketId, String movieName, double basePrice) {
        super(ticketId, movieName, basePrice);
    }

    @Override
    double calculateFinalPrice() {
        return basePrice * 1.25;
    }
}

class VIPTicket extends MovieTicket {
    VIPTicket(String ticketId, String movieName, double basePrice) {
        super(ticketId, movieName, basePrice);
    }

    @Override
    double calculateFinalPrice() {
        return basePrice * 1.50;
    }

    void displayVIPBenefits() {
        System.out.println("Includes Free Snacks!");
    }
}

public class MovieTicketSystem {
    public static void main(String[] args) {
        StandardTicket standard = new StandardTicket("T001", "3 Idiots", 200);
        PremiumTicket premium = new PremiumTicket("T002", "Student of the Year", 200);
        VIPTicket vip = new VIPTicket("T003", "Stree 2", 200);

        System.out.println("Standard Ticket Details:");
        standard.displayTicketDetails();
        System.out.println();

        System.out.println("Premium Ticket Details:");
        premium.displayTicketDetails();
        System.out.println();

        System.out.println("VIP Ticket Details:");
        vip.displayTicketDetails();
        vip.displayVIPBenefits();
    }
}