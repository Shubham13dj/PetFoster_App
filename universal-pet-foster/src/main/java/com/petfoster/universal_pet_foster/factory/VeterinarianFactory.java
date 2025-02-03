package com.petfoster.universal_pet_foster.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.petfoster.universal_pet_foster.model.User;
import com.petfoster.universal_pet_foster.model.Veterinarian;
import com.petfoster.universal_pet_foster.repository.VeterianarianRepository;
import com.petfoster.universal_pet_foster.request.RegistrationRequest;
import com.petfoster.universal_pet_foster.service.user.UserAtrributeMapper;

@Component
public class VeterinarianFactory {
	@Autowired
	private VeterianarianRepository veterianarianRepository;
	@Autowired
	private UserAtrributeMapper userAtrributeMapper;

	public User createVeterinarian(RegistrationRequest registrationRequest) {
		
		Veterinarian veterinarian = new Veterinarian();
		userAtrributeMapper.setCommonAttribute(registrationRequest, veterinarian);
		veterinarian.setSpecialization(registrationRequest.getSpecialization());
		return veterianarianRepository.save(veterinarian); 
	}

}
