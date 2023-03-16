package com.nineleaps.flightmanagementsystem.service.InterfaceService;

import java.util.*;

import com.nineleaps.flightmanagementsystem.entity.*;
public interface InterfaceUser{
    public User addUser(User newUser);
    public User modifyUser(User newUser,Long userId);
    public String deactivateUser(Long userId);
    public List<User> viewAllUser();
    public HashSet<Flight> searchFlight(String source,String Destination);
    public Flight viewSchedule(Long bookedFlightId);
    public Booking bookTicket(Passenger newPassenger,Flight bookedFlightId);
    public  Long purchaseTicket(Booking bookId);
    public Long cancelTicket(Long bookingId);
}