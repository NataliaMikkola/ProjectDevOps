package com.example.hotel_booking.service;

import com.example.hotel_booking.model.Room;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Room search feature: finds rooms that fit the customer's budget.
 */
@Service
public class RoomService {

    private final List<Room> rooms = List.of(
            new Room(1L, "101", 80.0),
            new Room(2L, "102", 100.0),
            new Room(3L, "103", 120.0)
    );

    public List<Room> getAllRooms() {
        return rooms;
    }

    /** Returns the rooms whose price per night is at most maxPrice. */
    public List<Room> findRoomsUnderPrice(double maxPrice) {
        if (maxPrice < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        return rooms.stream()
                .filter(room -> room.getPrice() <= maxPrice)
                .toList();
    }
}
