package com.petfoster.universal_pet_foster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petfoster.universal_pet_foster.model.Foster;

public interface FosterRepository extends JpaRepository<Foster, Long> {

}
