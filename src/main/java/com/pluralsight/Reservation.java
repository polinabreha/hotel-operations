package com.pluralsight;

public class Reservation {
    private String roomType;
    private static final double PRICE_KING = 139.00;
    private static final double PRICE_DOUBLE = 124.00;
    private int numberOfNights;
    private boolean weekend;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
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

    public int getNumberOfNights() {
        return numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    public boolean isWeekend() {
        return weekend;
    }

    public void setIsWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getPrice() {
        if (roomType.equalsIgnoreCase("King")) {
            return PRICE_KING;
        } else if (roomType.equalsIgnoreCase("Double")) {
            return PRICE_DOUBLE;
        }
        return 0.00 ;
    }

    public double getReservationTotal(){
        double total = getPrice() * numberOfNights ;
            if (weekend) {
                total *= 1.1;
            }
        return total;
    }


}
