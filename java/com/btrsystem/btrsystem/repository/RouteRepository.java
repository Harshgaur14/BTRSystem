package com.btrsystem.btrsystem.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.btrsystem.btrsystem.models.Route;

public interface RouteRepository extends JpaRepository<Route, UUID> {

}
