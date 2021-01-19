package Encapsulation_Polymerphism;

/**
 * POJO
 * give access and manipulate  the object
 * method using internal (method calling methods)git rm
 */

import java.util.Date;

public class Movie {
    private String nameOfMovie;
    private Date showTimes;
    private int releasedYear;
    private int totalTickets;
    private int ticketsLeft;
    private double ticketPrice;

    public Movie(double ticketPrice, int ticketsLeft, int totalTickets) {
        this.ticketPrice = ticketPrice;
        this.ticketsLeft = ticketsLeft;
        this.totalTickets = totalTickets;
    }

    //Give Access and Manipulate the Object
    public void sellTicket(int numOfTickets){
        if(hasTicketAmount(numOfTickets)){
            this.ticketsLeft -= numOfTickets;
            System.out.println("Tickets left after selling: "+this.ticketsLeft);
        }else{
            System.out.println("Insufficient amount of tickets.");
        }
    }

    //methods used internally
    private boolean hasTicketAmount(int numOfTickets) {
        if(numOfTickets > this.ticketsLeft){
            return false;
        }

        return true;
    }

    //give access and manipulate  the object
    public void releaseMoreTickets(int amount){
        increaseTicketsAmount(amount);
    }

    //methods used internally
    private void increaseTicketsAmount(int amount) {
        this.ticketsLeft += amount;
        this.totalTickets += amount;
        System.out.println("Number of Tickets left: "+this.ticketsLeft);
        System.out.println("Number of total tickets: "+this.totalTickets);
    }


    //Give Access and Manipulate the Object
    public double increaseTicketPrice(double ticketPrice) {
        double amountAfterincrease = increaseThePrice(ticketPrice);
        System.out.println("Amount after increase: "+ amountAfterincrease);
        return amountAfterincrease;
    }

    //methods used internally
    private double increaseThePrice(double price) {
        this.ticketPrice += price;
        return this.ticketPrice;
    }

}