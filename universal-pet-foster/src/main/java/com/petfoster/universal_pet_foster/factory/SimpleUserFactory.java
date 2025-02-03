package com.petfoster.universal_pet_foster.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.petfoster.universal_pet_foster.exception.UserAlreadyExistsException;
import com.petfoster.universal_pet_foster.model.User;
import com.petfoster.universal_pet_foster.repository.UserRepository;
import com.petfoster.universal_pet_foster.request.RegistrationRequest;

@Component

public class SimpleUserFactory implements UserFactory {
	
	@Autowired
	private  UserRepository userRepository;
	@Autowired
	private  VeterinarianFactory veterinarianFactory;
	@Autowired
	private  PatientFactory patientFactory;
	@Autowired
	private  AdminFactory adminFactory;

	@Override
	public User createUser(RegistrationRequest registrationRequest) {
		if (userRepository.existsByEmail(registrationRequest.getEmail())) {
			throw new UserAlreadyExistsException("Opps User is already there!! " + registrationRequest.getEmail());
		}
		switch (registrationRequest.getUserType()) {

		case "VET": {
			return veterinarianFactory.createVeterinarian(registrationRequest);
		}

		case "PATIENT": {
			return patientFactory.createPatient(registrationRequest);
		}

		case "ADMIN": {
			return adminFactory.createAdmin(registrationRequest);
		}

		default: {
			return null;
		}
		}

	}

}
