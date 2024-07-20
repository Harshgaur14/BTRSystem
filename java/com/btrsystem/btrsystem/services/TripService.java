package com.btrsystem.btrsystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btrsystem.btrsystem.repository.TripRepository;

@Service
public class TripService {
	
	@Autowired
	private TripRepository tripRepository;
	

}
