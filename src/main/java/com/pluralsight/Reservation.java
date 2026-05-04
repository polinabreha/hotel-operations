package com.pluralsight;

public class Reservation {
    private String roomType;
    private final double PRICE_KING;
    private final double PRICE_DOUBLE;
    private int numberOfNights;
    private boolean weekend;


    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.PRICE_KING = 139.00;
        this.PRICE_DOUBLE = 124.00;
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

    public double getReservationTotal(){
        double total = 0.00 ;
        if (roomType.equalsIgnoreCase("King")) {
            total = PRICE_KING * numberOfNights;
            if (weekend) {
                total = PRICE_KING * numberOfNights * 1.1;
            }
        } else if (roomType.equalsIgnoreCase("Double")) {
            total = PRICE_DOUBLE * numberOfNights;
            if (weekend) {
                total = PRICE_DOUBLE * numberOfNights * 1.1;
            }
        }

        return total;
    }


}
