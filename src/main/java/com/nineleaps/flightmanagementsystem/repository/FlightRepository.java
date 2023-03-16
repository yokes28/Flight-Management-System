package com.nineleaps.flightmanagementsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nineleaps.flightmanagementsystem.entity.Flight;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public interface FlightRepository extends JpaRepository<Flight,Long> {
    HashSet<Flight> findByDepartureLocationAndArrivalLocation(String source, String destination);
}
