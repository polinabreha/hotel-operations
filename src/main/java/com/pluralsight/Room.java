package com.pluralsight;

public class Room {
    int bed;
    double price;
    boolean occupied;
    boolean dirty;
    boolean available;


    public Room(int bed, double price) {
        this.bed = bed;
        this.price = price;
        this.occupied = false;
        this.dirty  = false;
        this.available = false;
    }

    public int getNumberOfBeds(){
        return this.bed;
    }

    public double getPrice(){
        return this.price;
    }

    public boolean isOccupied(){
        return this.occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        isOccupied();
        isDirty();
        return available;
    }
}
