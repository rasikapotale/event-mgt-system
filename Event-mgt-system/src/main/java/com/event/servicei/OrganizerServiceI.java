package com.event.servicei;

import java.util.List;

import com.event.entity.Organizer;

public interface OrganizerServiceI {

	Organizer createOrganizer(Organizer organizer);

	Organizer getOrganizerById(int id);

	List<Organizer> getAllOrganizers();

	Organizer updateOrganizer(int id, Organizer organizer);

	void deleteOrganizer(int id);

	Organizer assignEvent(int organizerId, int eventId);

}
