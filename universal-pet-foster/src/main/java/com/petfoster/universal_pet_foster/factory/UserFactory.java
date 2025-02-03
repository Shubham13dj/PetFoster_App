package com.petfoster.universal_pet_foster.factory;

import com.petfoster.universal_pet_foster.model.User;
import com.petfoster.universal_pet_foster.request.RegistrationRequest;

public interface UserFactory {
	public User createUser(RegistrationRequest registrationRequest);

}
