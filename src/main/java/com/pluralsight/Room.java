package com.pluralsight;

public class Room
{
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty, boolean available) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public void checkout()
    {

    }

    public void checkIn()
    {
        this.occupied = true;
        this.dirty = true;
    }

    public void setNumberOfBeds(int numberOfBeds)
    {
        NumberOfBeds = numberOfBeds;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {

        return occupied;

    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return (!this.dirty && !this.occupied);
    }
}
