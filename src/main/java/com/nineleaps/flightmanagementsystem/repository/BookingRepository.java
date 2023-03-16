package com.nineleaps.flightmanagementsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.flightmanagementsystem.entity.Booking;
@Repository
public interface BookingRepository extends JpaRepository<Booking,Long>{
    
}
