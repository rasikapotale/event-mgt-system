package com.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.event.entity.Event;

import com.event.entity.Venue;
import com.event.servicei.EventServiceI;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
public class EventController {

	@Autowired
	EventServiceI eventService;
	
	//create a new Event
	@PostMapping("/NewEvent")
	public Event NewEvent(@RequestBody Event event) {
		
		return eventService.newEvent(event);
	}
	
	//get All Events
	@GetMapping("/AllEvent")
	public List<Event> getAllEvent() {
		return eventService.getAllEvent();
	}
	
	//get Event By id
	@GetMapping("/getEventById/{id}")
	public Event getEventById(@PathVariable int id) {
		return eventService.getEventById(id);
	}
	
	//Update Event
	@PutMapping("/updateEvent/{id}")
    public Event updateEvent(@PathVariable int id, @RequestBody Event event) {
        return eventService.updateEvent(id, event);
    }
	
	//Delete Event
	
	@DeleteMapping("/deleteEvent/{id}")
    public void deleteEvent(@PathVariable int id) {
	      eventService.deleteEvent(id);
    
    }
	   //Get Event by Venue
	
	 @GetMapping("/venue/{venueId}")
	    public List<Event> getEventsByVenue(@PathVariable int venueId) {
	        return eventService.getEventsByVenue(venueId);
	    }
 
	//Get Events by Organizer
	 
	   @GetMapping("/organizer/{organizerId}")
	    public List<Event> getEventsByOrganizer(@PathVariable int organizerId) {
	        return eventService.getEventsByOrganizer(organizerId);
	    }
	
	   @PostMapping("/saveVenue/{id}")
		public Venue saveEvent(@PathVariable int id,@RequestBody Venue venue) {
			
		   Venue event=eventService.saveEvent(id,venue);
			
			return event;
		}
		
		
		 
	
	
}
