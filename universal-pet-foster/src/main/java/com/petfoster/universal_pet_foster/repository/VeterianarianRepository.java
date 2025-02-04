package com.petfoster.universal_pet_foster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petfoster.universal_pet_foster.model.Veterinarian;

@Repository
public interface VeterianarianRepository extends JpaRepository<Veterinarian, Long>{

}
