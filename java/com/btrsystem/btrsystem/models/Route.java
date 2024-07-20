package com.btrsystem.btrsystem.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.util.UUID;

@Entity
@Table(name = "route")
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID routeId;

    @NotBlank
    private String startLocation;

    @NotBlank
    private String endLocation;

    @NotNull
    private Float distance;

    @NotNull
    private java.sql.Time estimatedTime;

    // Default constructor
    public Route() {}

    // Parameterized constructor
    public Route(UUID routeId, @NotBlank String startLocation, @NotBlank String endLocation, @NotNull Float distance, @NotNull java.sql.Time estimatedTime) {
        this.routeId = routeId;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.distance = distance;
        this.estimatedTime = estimatedTime;
    }

    // Getters and Setters
    public UUID getRouteId() {
        return routeId;
    }

    public void setRouteId(UUID routeId) {
        this.routeId = routeId;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public java.sql.Time getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(java.sql.Time estimatedTime) {
        this.estimatedTime = estimatedTime;
    }
}
