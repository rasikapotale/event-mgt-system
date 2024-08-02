package com.event.servicei;

import java.util.List;

import com.event.entity.Venue;

public interface VenueServiceI {

	Venue createVenue(Venue venue);

	Venue getVenueById(int id);

	List<Venue> getAllVenues();

	Venue updateVenue(int id, Venue venue);

	void deleteVenue(int id);

}
