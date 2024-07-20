package com.btrsystem.btrsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btrsystem.btrsystem.models.Route;
import com.btrsystem.btrsystem.repository.RouteRepository;

@Service
public class RouteService {

	@Autowired
    private RouteRepository routeRepository;

    public Route addRoute(Route route) {
        return routeRepository.save(route);
    }
    
    public List<Route> getRoutes(){
    	return routeRepository.findAll();
    }
}
