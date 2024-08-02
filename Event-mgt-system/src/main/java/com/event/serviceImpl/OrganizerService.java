package com.event.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.entity.Event;
import com.event.entity.Organizer;
import com.event.repository.OrganizerRepository;
import com.event.servicei.EventServiceI;
import com.event.servicei.OrganizerServiceI;

@Service
public class OrganizerService implements OrganizerServiceI{

	@Autowired
	OrganizerRepository organizerRepository;
	@Autowired
	EventServiceI eventServiceI;
	
	@Override
	public Organizer createOrganizer(Organizer organizer) {
		
		return organizerRepository.save(organizer);
	}

	@Override
	public Organizer getOrganizerById(int id) {
		
		return organizerRepository.findById(id).get();
	}

	@Override
	public List<Organizer> getAllOrganizers() {
		
		return organizerRepository.findAll();
	}

	@Override
	public Organizer updateOrganizer(int id, Organizer organizer) {
	
		return organizerRepository.save(organizer);
	}

	@Override
	public void deleteOrganizer(int id) {
	organizerRepository.deleteById(id);
		
	}

	@Override
	public Organizer assignEvent(int organizerId, int eventId) {
		Organizer organizer = organizerRepository.findById(organizerId).get();
		        Event event = eventServiceI.getEventById(eventId);
		        organizer.getEvents().add(event);
		        event.setOrganizer(organizer);
		        
		return organizerRepository.save(organizer);
	}

	
}
