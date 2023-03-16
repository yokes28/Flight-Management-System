package com.nineleaps.flightmanagementsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nineleaps.flightmanagementsystem.entity.Fleet;
import org.springframework.stereotype.Repository;
@Repository
public interface FleetRepository extends JpaRepository<Fleet,Long>{
    
}
