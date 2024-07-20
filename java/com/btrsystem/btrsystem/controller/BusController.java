package com.btrsystem.btrsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.btrsystem.btrsystem.models.Bus;
import com.btrsystem.btrsystem.models.Route;
import com.btrsystem.btrsystem.models.User;

import com.btrsystem.btrsystem.services.BusService;
import com.btrsystem.btrsystem.services.RouteService;
import com.btrsystem.btrsystem.services.UsersService;


@RestController
@RequestMapping("/bus")
public class BusController {
	@Autowired
	private UsersService usersService;
	@Autowired
	private BusService busService;
	
	@Autowired
    private RouteService routeService;

	
	@PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping("/addBus")
    public ResponseEntity<Bus> addBus(@RequestBody Bus bus, @RequestParam int userId) {
        // Retrieve the user by userId
        User user = usersService.getUserById(userId);

        if (user == null) {
            return ResponseEntity.notFound().build();
        }

        // Set the user to the bus
        bus.setUser(user);

        // Save the bus
        Bus savedBus = busService.saveBus(bus);

        return ResponseEntity.ok(savedBus);
    }
	

	 @PostMapping("/addRoute")
	    @PreAuthorize("hasRole('ADMIN')")
	    public ResponseEntity<?> addRoute(@RequestBody Route route) {
	        Route newRoute = routeService.addRoute(route);
	        return ResponseEntity.ok(newRoute);
	    }
	 
	 @GetMapping("/details")
	 	public ResponseEntity<List<Bus>> getbuses(){
			List<Bus> buses=busService.getAllbus();
			return new ResponseEntity<>(buses,HttpStatus.OK);
		}
	 
	 @GetMapping("/routes")
	 public ResponseEntity<List<Route>> getRoutes(){
			List<Route> routes=routeService.getRoutes();
			return new ResponseEntity<>(routes,HttpStatus.OK);
		}
	 
	 

}
