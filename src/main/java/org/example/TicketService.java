package org.example;

public class TicketService {
    public static void main(String[] args) {
        int[] eventCode = {1, 2 , 3};
        Ticket t1 = new Ticket("12Ac", "Main", eventCode, 1720074335, true, 'A', 12.5);
        Ticket t2 = new Ticket("Orange");
        Ticket t3 = new Ticket();
    }
}