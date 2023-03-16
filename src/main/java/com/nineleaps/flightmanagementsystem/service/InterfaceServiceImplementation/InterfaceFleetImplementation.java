package com.nineleaps.flightmanagementsystem.service.InterfaceServiceImplementation;
import org.springframework.stereotype.Service;

import com.nineleaps.flightmanagementsystem.entity.Fleet;
import com.nineleaps.flightmanagementsystem.service.InterfaceService.InterfaceFleet;

@Service
public class InterfaceFleetImplementation implements InterfaceFleet {
    @Override
    public Fleet addFleet(Fleet newFleet){
        throw new UnsupportedOperationException("Unimplemented method 'addFleet'");
    }
    @Override
    public Fleet modifyFleet(int economySeats,int premiumSeats,int businessSeats){
        throw new UnsupportedOperationException("Unimplemented method 'modifyFleet'");
    }
    @Override
    public boolean deleteFleet(Long flightId){
        throw new UnsupportedOperationException("Unimplemented method 'deleteFleet'");
    }

}
