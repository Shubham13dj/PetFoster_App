package com.petfoster.universal_pet_foster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petfoster.universal_pet_foster.model.Foster;

@Repository
public interface FosterRepository extends JpaRepository<Foster, Long> {

}
