package com.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.entity.Venue;
import com.event.servicei.VenueServiceI;




@RestController
public class VenueController {

	@Autowired
	VenueServiceI venueService;
	
	
	    // Create a new Venue
	
	    @PostMapping("/createVenue")
	    public  Venue createVenue(@RequestBody Venue venue) {
	        return venueService.createVenue(venue);
	    }

	    // Get a Venue by ID
	    
	    @GetMapping("/getVenueById/{id}")
	    public Venue getVenueById(@PathVariable int id) {
	        return venueService.getVenueById(id);
	    }

	    // Get all Venues
	    @GetMapping("/getAllVenues")
	    public List<Venue> getAllVenues() {
	        return venueService.getAllVenues();
	    }

	    // Update a Venue by ID
	    @PutMapping("/updateVenue/{id}")
	    public Venue updateVenue(@PathVariable int id, @RequestBody Venue venue) {
	        return venueService.updateVenue(id, venue);
	    }

	    // Delete a Venue by ID
	    @DeleteMapping("/deleteVenue/{id}")
	    public void deleteVenue(@PathVariable int id) {
               venueService.deleteVenue(id);
	        
	    }
	   
}
