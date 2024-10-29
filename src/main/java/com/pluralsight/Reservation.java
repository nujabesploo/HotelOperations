package com.pluralsight;

public class Reservation {

    private final double Kingprice = 139.00;
    private final double doubleprice = 124.99;
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean weekend;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType(String roomType)
    {
        return this.roomType;
    }

    public void setRoomType(String roomType) {

        double weekendFactor = (this.weekend) ? 1.1 : 1;

        if(roomType.equalsIgnoreCase("king")){
            this.price = Kingprice;
        }
        else if(roomType.equalsIgnoreCase("double"))
        {
            this.price = doubleprice;
        }
    }

    public double getPrice()
    {

        return this.price;
    }

    public int getNumberOfNights() {
        return this.numberOfNights;
    }

    public void setnumberOfNights(int numberOfNights) {

        this.numberOfNights = numberOfNights;
    }
    public boolean isWeekend()
    {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;

    }
    public double getReservationTotal() {

        return this.numberOfNights * this.getPrice();
    }


}

