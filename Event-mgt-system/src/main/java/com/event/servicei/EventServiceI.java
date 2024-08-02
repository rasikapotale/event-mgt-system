package com.event.servicei;

import java.util.List;

import com.event.entity.Event;
import com.event.entity.Organizer;
import com.event.entity.Venue;

public interface EventServiceI {

	Event newEvent(Event event);

	List<Event> getAllEvent();

	Event getEventById(int id);

	void deleteEvent(int id);

	Event updateEvent(int id, Event event);

	List<Event> getEventsByVenue(int venueId);

	List<Event> getEventsByOrganizer(int organizerId);

	Venue saveEvent(int id, Venue venue);

	Organizer setorganizer(int id, Organizer organizer);

	//Event setEvent(int id, Event event);

	
}
