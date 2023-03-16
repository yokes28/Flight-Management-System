package com.nineleaps.flightmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nineleaps.flightmanagementsystem.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {

}
