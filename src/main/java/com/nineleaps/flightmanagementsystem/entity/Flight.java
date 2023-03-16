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
@Table(name = "flightTable")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String depatureLocation;
    private String arrivalLocation;
    private Date departureTime;
    private Date arrivalTime;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_fleet_id")
    private Fleet fleet;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_status_id")
    private FlightStatus status;

    public Flight() {
    }

    public Flight(Long id, String depatureLocation, String arrivalLocation, Fleet fleet, FlightStatus status,
            Date departureTime, Date arrivalTime) {
        this.id = id;
        this.depatureLocation = depatureLocation;
        this.arrivalLocation = arrivalLocation;
        this.fleet = fleet;
        this.status = status;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepatureLocation() {
        return this.depatureLocation;
    }

    public void setDepatureLocation(String depatureLocation) {
        this.depatureLocation = depatureLocation;
    }

    public String getArrivalLocation() {
        return this.arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public Fleet getFleet() {
        return this.fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    public FlightStatus getStatus() {
        return this.status;
    }

    public void setStatus(FlightStatus status) {
        this.status = status;
    }

    public Date getDepartureTime() {
        return this.departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", depatureLocation='" + getDepatureLocation() + "'" +
                ", arrivalLocation='" + getArrivalLocation() + "'" +
                ", fleet='" + getFleet() + "'" +
                ", status='" + getStatus() + "'" +
                ", departureTime='" + getDepartureTime() + "'" +
                ", arrivalTime='" + getArrivalTime() + "'" +
                "}";
    }

}