package com.pluralsight;

public class App {
    public static void main(String[] args) {

        Room room10 = new Room(1,139,true,true,false);
        System.out.println("Room Beds: " + room10.getNumberOfBeds());
        System.out.println("Room price: $" + room10.getPrice());
        System.out.println("Occupied? "+ room10.isOccupied());
        System.out.println("Dirty? " + room10.isDirty());
        System.out.println("Available? " + room10.isAvailable());

        System.out.println();

        Reservation reservation1 = new Reservation("King",139,2,true,152.9);
        System.out.println("Room type: " + reservation1.getRoomType());
        System.out.println("Room price: " + reservation1.getPrice());
        System.out.println("Number of nights " + reservation1.getNumberOfNights());
        System.out.println("Is weekend " + reservation1.isWeekend());
        System.out.println("you total is: " + reservation1.getReservationTotal());

        System.out.println();

        Employee employee1 = new Employee(5555,"steven vargas ","guest services",20,48);
        System.out.println("EmployeeId: " + employee1.getEmployeeId());
        System.out.println("Name: " + employee1.getName());
        System.out.println("Department: " + employee1.getDepartment());
        System.out.println("Pay rate: " + employee1.getPayRate());
        System.out.println("Hours worked: " + employee1.getRegularHours());
        System.out.println("over time: " + employee1.getOverTimeHours());
        System.out.println("total pay: $" + employee1.getTotalPay());

        System.out.println();


















    }
}
