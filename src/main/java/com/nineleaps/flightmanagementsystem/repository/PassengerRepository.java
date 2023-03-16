package com.nineleaps.flightmanagementsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nineleaps.flightmanagementsystem.entity.Passenger;
import org.springframework.stereotype.Repository;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {
    
}
