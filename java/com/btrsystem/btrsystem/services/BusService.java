package com.btrsystem.btrsystem.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.btrsystem.btrsystem.models.Bus;
import com.btrsystem.btrsystem.repository.BusRepository;

@Service
public class BusService {

	 @Autowired
	    private BusRepository busRepository;

	    public Bus saveBus(Bus bus) {
	        return busRepository.save(bus);
	    }

		public List<Bus> getAllbus() {
			// TODO Auto-generated method stub
			return busRepository.findAll();
		}
		
}
