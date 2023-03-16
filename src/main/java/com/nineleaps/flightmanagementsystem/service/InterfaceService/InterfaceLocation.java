package com.nineleaps.flightmanagementsystem.service.InterfaceService;

import com.nineleaps.flightmanagementsystem.entity.Location;

public interface InterfaceLocation {
    public Location addLocation(String source,String destination);
    public Location modifyLocation(String source,String destination);
    public boolean deleteLocation();
}
