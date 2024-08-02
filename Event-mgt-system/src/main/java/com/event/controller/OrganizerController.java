package com.event.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.event.entity.Organizer;
import com.event.servicei.OrganizerServiceI;

@RestController
public class OrganizerController {

	@Autowired
    private OrganizerServiceI organizerService;

    // Create  new Organizer
    @PostMapping("/createOrganizer")
    public Organizer createOrganizer(@RequestBody Organizer organizer) {
        return organizerService.createOrganizer(organizer);
    }

    // Get an Organizer by ID
    @GetMapping("/getOrganizerById/{id}")
    public Organizer getOrganizerById(@PathVariable int id) {
        return organizerService.getOrganizerById(id);
    }

    // Get all Organizers
    @GetMapping("/getAllOrganizers")
    public List<Organizer> getAllOrganizers() {
        return organizerService.getAllOrganizers();
    }

    // Update an Organizer by ID
    @PutMapping("/updateOrganizer/{id}")
    public Organizer updateOrganizer(@PathVariable int id, @RequestBody Organizer organizer) {
        return organizerService.updateOrganizer(id, organizer);
    }

    // Delete an Organizer by ID
    @DeleteMapping("/deleteOrganizer/{id}")
    public void deleteOrganizer(@PathVariable int id) {
        organizerService.deleteOrganizer(id);
        
    }
    @PostMapping("/assign_event/{organizerId}/{eventId}")
    public Organizer onAddeventToOrganzer(@PathVariable int organizerId,@PathVariable int eventId)
    {
    	Organizer organizer =organizerService.assignEvent(organizerId,eventId);
    	
    	return organizer;
    }
}
