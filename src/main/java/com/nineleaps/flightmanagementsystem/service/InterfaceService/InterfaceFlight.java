package com.nineleaps.flightmanagementsystem.service.InterfaceService;

import java.util.List;

import com.nineleaps.flightmanagementsystem.entity.Flight;
public interface InterfaceFlight {
    public Flight addFlight(Flight newFlight);
    public String deleteFlight(Long flightId);
    public List<Flight> getAllFlights();
    public Flight modifyFlight(Long flightId,Flight updatedFlight);
}
