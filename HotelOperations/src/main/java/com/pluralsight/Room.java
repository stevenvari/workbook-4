package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean isAvailable;


    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
        this.isAvailable = isAvailable;

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
        return !occupied && !dirty;
    }
    public void checkIn(){
        occupied = true;
        dirty = true;
    }
    public void checkOut(){
        cleanRoom();
        occupied = false;
    }
    public void cleanRoom(){
        dirty = false;
    }

}
