
package com.example.hotel_booking.model;

public class Room {
//its a comment
    private Long id;
    private String roomNumber;
    private double price;

    public Room(Long id, String roomNumber, double price) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public double getPrice() {
        return price;
    }
}

