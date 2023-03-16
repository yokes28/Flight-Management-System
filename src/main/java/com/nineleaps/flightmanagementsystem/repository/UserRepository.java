package com.nineleaps.flightmanagementsystem.repository;

import com.nineleaps.flightmanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    
}
