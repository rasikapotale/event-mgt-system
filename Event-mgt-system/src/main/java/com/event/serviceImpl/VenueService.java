package com.event.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.entity.Venue;
import com.event.repository.VenueRepository;
import com.event.servicei.VenueServiceI;

@Service
public class VenueService implements VenueServiceI{

	
	@Autowired
	VenueRepository venueRepository;
	@Override
	public Venue createVenue(Venue venue) {
		
		return venueRepository.save(venue);
	}

	@Override
	public Venue getVenueById(int id) {
		
		return venueRepository.findById(id).get();
	}

	@Override
	public List<Venue> getAllVenues() {
		
		return venueRepository.findAll();
	}

	@Override
	public Venue updateVenue(int id, Venue venue) {
	return venueRepository.save(venue);
	}

	@Override
	public void deleteVenue(int id) {
	venueRepository.deleteById(id);
		
	}

}
