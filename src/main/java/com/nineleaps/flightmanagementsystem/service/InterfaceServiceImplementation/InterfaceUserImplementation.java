package com.nineleaps.flightmanagementsystem.service.InterfaceServiceImplementation;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.nineleaps.flightmanagementsystem.entity.Booking;
import com.nineleaps.flightmanagementsystem.entity.Flight;
import com.nineleaps.flightmanagementsystem.entity.Passenger;
import com.nineleaps.flightmanagementsystem.entity.User;
import com.nineleaps.flightmanagementsystem.service.InterfaceService.InterfaceUser;

import java.util.List;
import com.nineleaps.flightmanagementsystem.repository.UserRepository;
import com.nineleaps.flightmanagementsystem.repository.FlightRepository;
import com.nineleaps.flightmanagementsystem.repository.PassengerRepository;
@Service
public class InterfaceUserImplementation implements InterfaceUser {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private FlightRepository flightRepo;

    @Autowired
    private PassengerRepository passengerRepo;

    @Override
    public User addUser(User newUser){
        return userRepo.save(newUser);
    }

    @Override
    public User modifyUser(User newUser,Long userId){
        return userRepo.save(newUser);
    }

    @Override
    public String deactivateUser(Long userId){
        return "UserStatus-false";
    }

    @Override
    public List<User> viewAllUser(){
        return userRepo.findAll();
    }

//    @Override
//    public List<Flight> searchFlight(String source, String Destination) {
//        return null;
//    }

    @Override
    public List<Flight> searchFlight(String source, String Destination){
        return flightRepo.findByDepatureLocationAndArrivalLocation(source, Destination);
    }

    @Override
    public Flight viewSchedule(Long bookedFlightId){
        return flightRepo.findById(bookedFlightId).get();
        
    }
    @Override
    public Booking bookTicket(Passenger newPassenger,Flight bookedFlightId){
        return null;
    }
    @Override
    public  Long purchaseTicket(Booking bookId){
        return null;
    }
    @Override
    public Long cancelTicket(Long bookingId){
        return null;
    }
}
