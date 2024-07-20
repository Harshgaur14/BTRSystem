package com.btrsystem.btrsystem.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.btrsystem.btrsystem.models.Trip;
@Repository
public interface TripRepository extends JpaRepository<Trip, UUID>{

}
