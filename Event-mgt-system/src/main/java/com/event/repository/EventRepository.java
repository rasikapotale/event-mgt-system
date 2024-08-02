package com.event.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.event.entity.Event;
import com.event.entity.Venue;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer>{

	 List<Event> findByVenue_Id(int venueId);
	   List<Event> findByOrganizer_Id(int organizerId);

	
}
