package com.nineleaps.flightmanagementsystem.service.InterfaceService;

import com.nineleaps.flightmanagementsystem.entity.Fare;

public interface InterfaceFare {
    public Fare modifyFare(double economyFare,double premiumFare,double businessFare);
}
