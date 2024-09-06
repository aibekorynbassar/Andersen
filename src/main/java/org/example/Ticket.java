package org.example;

import java.math.BigDecimal;

public class Ticket {
    private char[] id;
    private String cHall;
    private int[] eventCode;
    private long time;
    private boolean isPromo;
    private char stadiumSector;
    private double maxWeight;

    private long creationTime;
    private BigDecimal price;

    public Ticket(){}

    public Ticket(String id, String cHall, int[] eventCode, long time, boolean isPromo, char stadiumSector,
                  double maxWeight){

        if (id.length() > 4){
            System.out.println("max length of id is 4");
            return;
        }
        if (cHall.length() > 10){
            System.out.println("max length of concert Hall");
            return;
        }
        if (eventCode.length != 3){
            System.out.println("length of Event Code must be 3");
            return;
        }
        if (stadiumSector < 65 || stadiumSector > 67){
            System.out.println("Stadium sector must be between A and C");
            return;
        }

        this.id = id.toCharArray();

        this.cHall = cHall;
        this.eventCode = eventCode.clone();
        this.time = time;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxWeight = maxWeight;

        creationTime = System.currentTimeMillis() / 1000L;
    }
    public Ticket(String cHall) {
        if (cHall.length() > 10){
            System.out.println("max length of concert Hall");
        }
        this.cHall = cHall;
        creationTime = System.currentTimeMillis() / 1000L;
    }

    public Ticket(int[] eventCode) {
        if (eventCode.length != 3){
            System.out.println("length of Event Code must be 3");
            return;
        }
        this.eventCode = eventCode.clone();
        creationTime = System.currentTimeMillis() / 1000L;
    }

    public Ticket(long time){
        this.time = time;
        creationTime = System.currentTimeMillis() / 1000L;
    }

    public void setPrice(String price){
        this.price = new BigDecimal(price);
    }

    public String getPrice(){
        return price.toString();
    }
}
