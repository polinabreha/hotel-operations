package com.pluralsight;

public class Room {
    private final int bed;
    private final double price;
    private boolean occupied;
    private boolean dirty;


    public Room(int bed, double price) {
        this.bed = bed;
        this.price = price;
        this.occupied = true;
        this.dirty  = true;
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

    public void setOccupied(boolean occupied){
        this.occupied = occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return !isOccupied() && !isDirty();
    }
}
