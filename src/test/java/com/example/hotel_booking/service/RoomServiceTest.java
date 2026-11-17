package com.example.hotel_booking.service;

import com.example.hotel_booking.model.Room;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoomServiceTest {

    private final RoomService roomService = new RoomService();

    @Test
    void returnsAllRooms() {
        assertEquals(3, roomService.getAllRooms().size());
    }

    @Test
    void findsRoomsUnderMaxPrice() {
        List<Room> result = roomService.findRoomsUnderPrice(100.0);
        assertEquals(2, result.size());
        assertTrue(result.stream().allMatch(r -> r.getPrice() <= 100.0));
    }

    @Test
    void returnsEmptyListWhenAllRoomsAreTooExpensive() {
        assertTrue(roomService.findRoomsUnderPrice(50.0).isEmpty());
    }

    @Test
    void rejectsNegativePrice() {
        assertThrows(IllegalArgumentException.class,
                () -> roomService.findRoomsUnderPrice(-1.0));
    }
}
