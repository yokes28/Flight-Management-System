package com.nineleaps.flightmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="flightStatusTable")
public class FlightStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int remainingEconomySeats;
    private int remainingPremiumSeats;
    private int remainingBusinessSeats;



    public FlightStatus() {
    }


    public FlightStatus(int id, int remainingEconomySeats, int remainingPremiumSeats, int remainingBusinessSeats) {
        this.id = id;
        this.remainingEconomySeats = remainingEconomySeats;
        this.remainingPremiumSeats = remainingPremiumSeats;
        this.remainingBusinessSeats = remainingBusinessSeats;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRemainingEconomySeats() {
        return this.remainingEconomySeats;
    }

    public void setRemainingEconomySeats(int remainingEconomySeats) {
        this.remainingEconomySeats = remainingEconomySeats;
    }

    public int getRemainingPremiumSeats() {
        return this.remainingPremiumSeats;
    }

    public void setRemainingPremiumSeats(int remainingPremiumSeats) {
        this.remainingPremiumSeats = remainingPremiumSeats;
    }

    public int getRemainingBusinessSeats() {
        return this.remainingBusinessSeats;
    }

    public void setRemainingBusinessSeats(int remainingBusinessSeats) {
        this.remainingBusinessSeats = remainingBusinessSeats;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", remainingEconomySeats='" + getRemainingEconomySeats() + "'" +
            ", remainingPremiumSeats='" + getRemainingPremiumSeats() + "'" +
            ", remainingBusinessSeats='" + getRemainingBusinessSeats() + "'" +
            "}";
    }


}
