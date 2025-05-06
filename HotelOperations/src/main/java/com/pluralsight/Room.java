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
        if (isAvailable){
            occupied = true;
            dirty = true;
            System.out.println("Guest has checked in. ");
        }else {
            System.out.println("Room is not currently occupied");
        }
   }
   public void checkOut(){
        if (occupied){
            occupied = false;
            System.out.println("Guest has checked out. Room is dirty and must be clean ");
        }else {
            System.out.println("Room is not currently occupied");
        }
   }
   public void cleanRoom(){
        if (!occupied){
            dirty = false;
            System.out.println("Room has been cleaned and is now ready for the next guest");
        }else {
            System.out.println("Can not clean an occupied room");
        }
   }

}
