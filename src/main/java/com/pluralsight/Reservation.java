package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    public double priceKing;
    public double priceDouble;
    private int numberOfNights;
    private boolean weekend;


    public Reservation(String roomType, double price, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.price = price;
        this.priceKing = 139.00;
        this.priceDouble = 124.00;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() {
        if (roomType.equalsIgnoreCase("King")) {
            return "King";
        }else if (roomType.equalsIgnoreCase("Double")) {
            return "Double";
        }
        return "Unknown";
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    public boolean isWeekend() {
        return weekend;
    }

    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal(){
        if (roomType.equalsIgnoreCase("King")) {
            price = priceKing * numberOfNights;
            if (weekend) {
                price = priceKing * numberOfNights * 0.1;
            }
        } else if (roomType.equalsIgnoreCase("Double")) {
            price = priceDouble * numberOfNights;
            if (weekend) {
                price = priceDouble * numberOfNights * 0.1;
            }
        }
        return price;
    }


}
