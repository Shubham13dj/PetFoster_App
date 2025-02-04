package com.petfoster.universal_pet_foster.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petfoster.universal_pet_foster.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

}
