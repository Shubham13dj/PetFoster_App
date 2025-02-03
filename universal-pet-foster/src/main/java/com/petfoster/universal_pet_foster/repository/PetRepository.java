package com.petfoster.universal_pet_foster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petfoster.universal_pet_foster.model.Pet;

public abstract class PetRepository implements JpaRepository<Pet, Long> {

}
