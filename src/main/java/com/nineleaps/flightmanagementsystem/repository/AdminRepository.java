package com.nineleaps.flightmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.flightmanagementsystem.entity.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {
    
}
