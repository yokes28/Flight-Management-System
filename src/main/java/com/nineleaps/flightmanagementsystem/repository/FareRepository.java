package com.nineleaps.flightmanagementsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nineleaps.flightmanagementsystem.entity.Fare;
import org.springframework.stereotype.Repository;
@Repository
public interface FareRepository extends JpaRepository<Fare,Long> {
    
}
