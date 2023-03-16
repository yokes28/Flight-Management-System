package com.nineleaps.flightmanagementsystem.service.InterfaceServiceImplementation;
import org.springframework.stereotype.Service;

import com.nineleaps.flightmanagementsystem.entity.Location;
import com.nineleaps.flightmanagementsystem.service.InterfaceService.InterfaceLocation;

@Service
public class InterfaceLocationImplementation implements InterfaceLocation {
    @Override
    public Location addLocation(String source,String destination){
        throw new UnsupportedOperationException("Unimplemented method 'addLocation'");
    }
    @Override
    public Location modifyLocation(String source,String destination){
        throw new UnsupportedOperationException("Unimplemented method 'modifyLocation'");
    }
    @Override
    public boolean deleteLocation(){
        throw new UnsupportedOperationException("Unimplemented method 'deleteLocation'");
    }
}
