package com.nineleaps.flightmanagementsystem.service.InterfaceService;
import com.nineleaps.flightmanagementsystem.entity.Flight;

public interface InterfaceAdmin {
    public Flight addFlightDetails(Flight newFlight);
    public Flight updateFlightDetails(Long flightId);
}
