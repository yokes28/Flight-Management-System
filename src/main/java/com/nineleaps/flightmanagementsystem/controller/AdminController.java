package com.nineleaps.flightmanagementsystem.controller;

import com.nineleaps.flightmanagementsystem.entity.Flight;
import com.nineleaps.flightmanagementsystem.entity.User;
import com.nineleaps.flightmanagementsystem.service.InterfaceServiceImplementation.InterfaceFlightImplementation;
import com.nineleaps.flightmanagementsystem.service.InterfaceServiceImplementation.InterfaceUserImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private InterfaceFlightImplementation flightImp;
    @Autowired
    private InterfaceUserImplementation userImp;

    @GetMapping("/viewallflights")
    public List<Flight> getAllFlights(){
        return flightImp.getAllFlights();
    }

    @GetMapping("/viewallusers")
    public List<User> viewAllUser(){
        return userImp.viewAllUser();
    }

    @PostMapping("/addflight")
    public Flight addFlight(Flight newFlight){
        return flightImp.addFlight(newFlight);
    }

    @PutMapping("/updateflight/{flightId}")
    public Flight modifyFlight(@RequestBody Long flightId,@RequestBody Flight updatedFlight){
        return flightImp.modifyFlight(flightId,updatedFlight);
    }

    @GetMapping("/cancelFlight/{flightId}")
    public String deleteFlight(Long flightId){
        return "flight deleted sucessfully";
    }
}
