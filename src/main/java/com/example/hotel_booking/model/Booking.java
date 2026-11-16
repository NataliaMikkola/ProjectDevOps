
package com.example.hotel_booking.model;

import java.time.LocalDate;

public class Booking {

    private Long id;
    private String guestName;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private Room room;

    public Booking(Long id, String guestName,
                   LocalDate checkIn, LocalDate checkOut,
                   Room room) {
        this.id = id;
        this.guestName = guestName;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.room = room;
    }

    public Long getId() {
        return id;
    }

    public String getGuestName() {
        return guestName;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public Room getRoom() {
        return room;
    }
}
