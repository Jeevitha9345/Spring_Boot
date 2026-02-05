package com.example.person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface person_repository extends JpaRepository<Person_Model, Long> {
}