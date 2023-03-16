package com.nineleaps.flightmanagementsystem.service.InterfaceServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.nineleaps.flightmanagementsystem.entity.Flight;
import com.nineleaps.flightmanagementsystem.service.InterfaceService.InterfaceFlight;
import com.nineleaps.flightmanagementsystem.repository.*;

@Service
public class InterfaceFlightImplementation implements InterfaceFlight {
    @Autowired
    private FlightRepository flightrepo;
    @Override
    public Flight addFlight(Flight newFlight){
        return flightrepo.save(newFlight);
    }
    
    @Override
    public String deleteFlight(Long flightId){
        flightrepo.deleteById(flightId);
        return "flight deleted";
    }

    @Override
    public Flight modifyFlight(Long flightId,Flight updatedFlight){
        Flight res = flightrepo.findById(flightId).get();
        if (res != null) {
            res.setDepatureLocation(updatedFlight.getDepatureLocation());
            res.setArrivalLocation(updatedFlight.getArrivalLocation());
            res.setDepartureTime(updatedFlight.getDepartureTime());
            res.setArrivalTime(updatedFlight.getArrivalTime());
        }
        flightrepo.save(res);
        return res;
    }

    @Override
    public List<Flight> getAllFlights(){
        return flightrepo.findAll();
    }

}