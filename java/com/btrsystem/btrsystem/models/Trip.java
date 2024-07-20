package com.btrsystem.btrsystem.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name = "trip")
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID tripId;

    @ManyToOne
    @NotNull
    private Bus bus;

    @ManyToOne
    @NotNull
    private Route route;

    @NotNull
    private Timestamp departureTime;

    @NotNull
    private Timestamp arrivalTime;

    @NotNull
    private Integer availableSeats;

    @NotNull
    private Float fare;

    // Default constructor
    public Trip() {}

    // Parameterized constructor
    public Trip(UUID tripId, @NotNull Bus bus, @NotNull Route route, @NotNull Timestamp departureTime, @NotNull Timestamp arrivalTime, @NotNull Integer availableSeats, @NotNull Float fare) {
        this.tripId = tripId;
        this.bus = bus;
        this.route = route;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.availableSeats = availableSeats;
        this.fare = fare;
    }

    // Getters and Setters
    public UUID getTripId() {
        return tripId;
    }

    public void setTripId(UUID tripId) {
        this.tripId = tripId;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public Timestamp getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Timestamp departureTime) {
        this.departureTime = departureTime;
    }

    public Timestamp getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Timestamp arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    public Float getFare() {
        return fare;
    }

    public void setFare(Float fare) {
        this.fare = fare;
    }
}
