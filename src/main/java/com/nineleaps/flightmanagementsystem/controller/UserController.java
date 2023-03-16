package com.nineleaps.flightmanagementsystem.controller;

import com.nineleaps.flightmanagementsystem.entity.User;
import com.nineleaps.flightmanagementsystem.service.InterfaceServiceImplementation.InterfaceBookingImplementation;
import com.nineleaps.flightmanagementsystem.service.InterfaceServiceImplementation.InterfaceUserImplementation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
