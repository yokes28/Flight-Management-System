package com.nineleaps.flightmanagementsystem.service.InterfaceService;

import com.nineleaps.flightmanagementsystem.entity.Fleet;

public interface InterfaceFleet {
    public Fleet addFleet(Fleet newFleet);
    public Fleet modifyFleet(int economySeats,int premiumSeats,int businessSeats);
    public boolean deleteFleet(Long flightId);
}
