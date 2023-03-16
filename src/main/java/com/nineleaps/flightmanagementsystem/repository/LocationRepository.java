package com.nineleaps.flightmanagementsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nineleaps.flightmanagementsystem.entity.Location;
import org.springframework.stereotype.Repository;
@Repository
public interface LocationRepository extends JpaRepository<Location,Long>{
    
}
