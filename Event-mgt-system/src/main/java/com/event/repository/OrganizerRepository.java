package com.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.event.entity.Organizer;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Integer>{

}
