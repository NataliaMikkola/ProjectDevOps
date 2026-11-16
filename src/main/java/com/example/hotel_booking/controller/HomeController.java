
package com.example.hotel_booking.controller;

import com.example.hotel_booking.model.Room;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {

        List<Room> rooms = List.of(
                new Room(1L, "101", 80.0),
                new Room(2L, "102", 100.0),
                new Room(3L, "103", 120.0)
        );

        model.addAttribute("rooms", rooms);

        return "index";
    }
}
