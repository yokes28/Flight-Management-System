package com.nineleaps.flightmanagementsystem.service.InterfaceServiceImplementation;
import org.springframework.stereotype.Service;

import com.nineleaps.flightmanagementsystem.entity.Fare;
import com.nineleaps.flightmanagementsystem.service.InterfaceService.InterfaceFare;
@Service
public class InterfaceFareImplementation implements InterfaceFare {

    @Override
    public Fare modifyFare(double economyFare, double premiumFare, double businessFare) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyFare'");
    }
    
}
