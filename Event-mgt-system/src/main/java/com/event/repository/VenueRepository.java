package com.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.event.entity.Venue;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Integer>{

}
