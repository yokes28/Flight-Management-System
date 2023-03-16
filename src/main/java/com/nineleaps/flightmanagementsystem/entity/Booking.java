package com.nineleaps.flightmanagementsystem.entity;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bookingTable")
public class Booking{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long bookingNumber;    
    private Date bookinDate;
    private Date travelDate;
    private double totalCost;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_flight_id")
    private Flight flight;

    public Booking() {
    }

    public Booking(Long id, Long bookingNumber, Date bookinDate, Date travelDate, double totalCost, Flight flight) {
        this.id = id;
        this.bookingNumber = bookingNumber;
        this.bookinDate = bookinDate;
        this.travelDate = travelDate;
        this.totalCost = totalCost;
        this.flight = flight;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookingNumber() {
        return this.bookingNumber;
    }

    public void setBookingNumber(Long bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    public Date getBookinDate() {
        return this.bookinDate;
    }

    public void setBookinDate(Date bookinDate) {
        this.bookinDate = bookinDate;
    }

    public Date getTravelDate() {
        return this.travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public double getTotalCost() {
        return this.totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", bookingNumber='" + getBookingNumber() + "'" +
            ", bookinDate='" + getBookinDate() + "'" +
            ", travelDate='" + getTravelDate() + "'" +
            ", totalCost='" + getTotalCost() + "'" +
            ", flight='" + getFlight() + "'" +
            "}";
    }


}