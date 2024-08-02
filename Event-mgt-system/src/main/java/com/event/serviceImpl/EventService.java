package com.event.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.event.entity.Event;
import com.event.entity.Organizer;
import com.event.entity.Venue;
import com.event.repository.EventRepository;
import com.event.repository.VenueRepository;
import com.event.servicei.EventServiceI;

@Service
public class EventService implements EventServiceI{

	@Autowired
	EventRepository eventRepository;
	
	@Autowired
	VenueRepository venueRepository;
	
	@Override
	public Event newEvent(Event event) {
	
		return eventRepository.save(event);
	}

	@Override
	public List<Event> getAllEvent() {
		
		return eventRepository.findAll();
	}

	@Override
	public Event getEventById(int id) {
		
		return eventRepository.findById(id).get();
	}

	@Override
	public void deleteEvent(int id) {
		eventRepository.deleteById(id); ;
	}

	@Override
	public Event updateEvent(int id, Event event) {
		
		return eventRepository.save(event);
	}

	@Override
	public List<Event> getEventsByVenue(int venueId) {
		
		return eventRepository.findByVenue_Id(venueId);
	}

	@Override
	public List<Event> getEventsByOrganizer(int organizerId) {
		
		return eventRepository.findByOrganizer_Id(organizerId);
	}

	@Override
	public Venue saveEvent(int id, Venue venue) {
		Optional<Event> event=eventRepository.findById(id);
		Event ev=event.get();
		venue.setEvent(ev);
		ev.setVenue(venue);
		ev.setOrganizer(null);
		venue.setId(id);
		return venueRepository.save(venue);
	}

	@Override
	public Organizer setorganizer(int id, Organizer organizer) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public Event setEvent(int id, Event event) { Optional<Venue>
	 * venue=venueRepository.findById(id); Venue ev=venue.get();
	 * 
	 * event.setVenue(ev);
	 * 
	 * event.setId(id); return eventRepository.save(event); }
	 */

	
	
	

	
}
