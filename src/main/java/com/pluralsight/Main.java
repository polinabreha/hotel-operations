package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        room();
        reservation();
        employee();

    }

    public static void room(){
        Room room = new Room(2,150.00);
        System.out.println("Available: " + room.isAvailable()); // false
        room.checkOut();
        room.cleanRoom();
        System.out.println("Available: " + room.isAvailable()); // true

        Reservation res = new Reservation("King", 3, true);
        System.out.printf("Total: %.2f%n" , res.getReservationTotal());
    }

    public static void reservation(){
        Reservation reservation = new Reservation("King", 3, true);
        System.out.println("Is weekend? " + reservation.isWeekend());
        System.out.println("Number of nights: " + reservation.getNumberOfNights());
        System.out.println("Your room type is: " + reservation.getRoomType());
        System.out.printf("Start price: %.2f%n" , reservation.getPrice());
        System.out.printf("End price: %.2f%n" , reservation.getReservationTotal());

    }
    public static void employee(){
        Employee emp = new Employee(1, "John", "IT") ;
        emp.setPayRate(20.00);
        emp.punchTimeCard(9);
        emp.punchTimeCard(17);

        System.out.println("Hours Worked: " + emp.getHoursWorked());
        System.out.println("Regular Hours: " + emp.getRegularHours());
        System.out.println("Overtime Hours: " + emp.getOvertimeHours());
        System.out.println("Hours worked: " + emp.getHoursWorked());
        System.out.println("Total Pay: " + emp.getTotalPay());
    }
}
