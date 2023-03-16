package com.nineleaps.flightmanagementsystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="fareTable")
public class Fare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="fare_id")
    private int id;
    private double economyFare;
    private double premiumFare;
    private double businessFare;


    public Fare() {
    }

    public Fare(int id, double economyFare, double premiumFare, double businessFare) {
        this.id = id;
        this.economyFare = economyFare;
        this.premiumFare = premiumFare;
        this.businessFare = businessFare;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getEconomyFare() {
        return this.economyFare;
    }

    public void setEconomyFare(double economyFare) {
        this.economyFare = economyFare;
    }

    public double getPremiumFare() {
        return this.premiumFare;
    }

    public void setPremiumFare(double premiumFare) {
        this.premiumFare = premiumFare;
    }

    public double getBusinessFare() {
        return this.businessFare;
    }

    public void setBusinessFare(double businessFare) {
        this.businessFare = businessFare;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", economyFare='" + getEconomyFare() + "'" +
            ", premiumFare='" + getPremiumFare() + "'" +
            ", businessFare='" + getBusinessFare() + "'" +
            "}";
    }



}
