package com.petfoster.universal_pet_foster.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.petfoster.universal_pet_foster.model.Admin;
import com.petfoster.universal_pet_foster.model.User;
import com.petfoster.universal_pet_foster.repository.AdminRepository;
import com.petfoster.universal_pet_foster.request.RegistrationRequest;
import com.petfoster.universal_pet_foster.service.user.UserAtrributeMapper;


@Component
public class AdminFactory {
	
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private UserAtrributeMapper userAtrributeMapper;
	
public User createAdmin(RegistrationRequest registrationRequest) {
		Admin admin = new Admin();
		userAtrributeMapper.setCommonAttribute(registrationRequest, admin);
		return adminRepository.save(admin); 
	}

}
