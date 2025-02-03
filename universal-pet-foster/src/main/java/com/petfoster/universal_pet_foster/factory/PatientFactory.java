package com.petfoster.universal_pet_foster.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.petfoster.universal_pet_foster.model.Patient;
import com.petfoster.universal_pet_foster.model.User;
import com.petfoster.universal_pet_foster.repository.PatientRepository;
import com.petfoster.universal_pet_foster.request.RegistrationRequest;
import com.petfoster.universal_pet_foster.service.user.UserAtrributeMapper;

@Component

public class PatientFactory {

	@Autowired
	private PatientRepository patientRepository;
	@Autowired
	private UserAtrributeMapper userAtrributeMapper;

	public User createPatient(RegistrationRequest registrationRequest) {
		Patient patient = new Patient();
		userAtrributeMapper.setCommonAttribute(registrationRequest, patient);
		return patientRepository.save(patient);
	}

}
