package com.pluralsight;

public class Room {

    private int numberOfBeds;
    private double price;
    private boolean isOccupied = false;
    private boolean isDirty = false;
    private boolean isAvailable = false;

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty, boolean isAvailable) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }
    public boolean isAvailable() {
        return !isAvailable;
    }
    public boolean isDirty() {
        return isDirty;
    }
}
