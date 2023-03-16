package com.nineleaps.flightmanagementsystem.controller;

import com.nineleaps.flightmanagementsystem.entity.Booking;
import com.nineleaps.flightmanagementsystem.entity.Flight;
import com.nineleaps.flightmanagementsystem.entity.User;
import com.nineleaps.flightmanagementsystem.service.InterfaceServiceImplementation.InterfaceBookingImplementation;
import com.nineleaps.flightmanagementsystem.service.InterfaceServiceImplementation.InterfaceUserImplementation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private InterfaceUserImplementation userImp;
    @Autowired
    private InterfaceBookingImplementation bookImp;

    @PostMapping("/adduserdetails")
    public User addUser(@RequestBody User newUser){
        return userImp.addUser(newUser);
    }

    @PutMapping("/updateuserdetails/{id}")
    public User modifyUser(@RequestBody User newUser,@PathVariable Long userId){
        return userImp.modifyUser(newUser,userId);
    }

    @GetMapping("/searchflights/{source}/{destination}")
    public List<Flight> searchFlights(@PathVariable("source") String source, @PathVariable("destination") String destination) {
        return userImp.searchFlight(source, destination);
    }

    @PostMapping("/bookflight")
    public Booking bookFlight(@RequestBody Booking newBooking) {
        return bookImp.bookFlight(newBooking);
    }

    @GetMapping("/viewallbooking")
    public List<Booking> viewAllBooking() {
        return bookImp.viewAllBooking();
    }

    @GetMapping("/cancelbooking/{id}")
    public Booking cancelBooking(@PathVariable("id") Long id) {
        return bookImp.cancelBooking(id);
    }

    @PutMapping("/modifybooking/{id}")
    public Booking modifyBooking(@RequestBody Booking modifyBooking, @PathVariable("id") Long id) {
        return bookImp.modifyBooking(modifyBooking, id);
    }


}
