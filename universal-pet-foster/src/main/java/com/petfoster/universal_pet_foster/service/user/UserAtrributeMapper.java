package com.petfoster.universal_pet_foster.service.user;

import org.springframework.stereotype.Component;

import com.petfoster.universal_pet_foster.model.User;
import com.petfoster.universal_pet_foster.request.RegistrationRequest;

@Component
public class UserAtrributeMapper {


	public void setCommonAttribute(RegistrationRequest source,User target) {
		target.setFirstName(source.getFirstName());
		target.setLastName(source.getLastName());
		target.setGender(source.getGender());
		target.setPhoneNumber(source.getPhoneNumber());
		target.setEmail(source.getEmail());
		target.setPassword(source.getPassword());
		target.setEnabled(source.isEnabled());
		target.setUserType(source.getUserType());
		

	}
}
