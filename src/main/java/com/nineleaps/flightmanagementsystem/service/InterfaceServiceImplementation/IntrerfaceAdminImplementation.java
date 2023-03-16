package com.nineleaps.flightmanagementsystem.service.InterfaceServiceImplementation;
import com.nineleaps.flightmanagementsystem.entity.Flight;
import com.nineleaps.flightmanagementsystem.service.InterfaceService.InterfaceAdmin;
import org.springframework.stereotype.Service;

@Service
public class IntrerfaceAdminImplementation implements InterfaceAdmin {

    @Override
    public Flight addFlightDetails(Flight newFlight) {
        
        throw new UnsupportedOperationException("Unimplemented method 'addFlightDetails'");
    }

    @Override
    public Flight updateFlightDetails(Long flightId) {
        
        throw new UnsupportedOperationException("Unimplemented method 'updateFlightDetails'");
    }

    
}
