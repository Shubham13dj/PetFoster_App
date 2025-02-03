package com.petfoster.universal_pet_foster.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petfoster.universal_pet_foster.factory.UserFactory;
import com.petfoster.universal_pet_foster.model.User;
import com.petfoster.universal_pet_foster.repository.UserRepository;
import com.petfoster.universal_pet_foster.request.RegistrationRequest;



@Service

public class UserService {
	
	@Autowired
	UserFactory userFactory;
	public User add(RegistrationRequest registrationRequest) {
		return userFactory.createUser(registrationRequest);
	}

} 
