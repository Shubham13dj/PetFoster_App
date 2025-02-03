package com.petfoster.universal_pet_foster.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petfoster.universal_pet_foster.FosterDTO;
import com.petfoster.universal_pet_foster.model.Foster;
import com.petfoster.universal_pet_foster.repository.FosterRepository;

@Service
public class FosterService {

	@Autowired
	private FosterRepository fosterRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<FosterDTO> getAllFoster()
	{
		List<Foster> fosters = fosterRepository.findAll();
		
		return fosters.stream()
				.map(foster -> modelMapper.map(fosters, FosterDTO.class))
				.collect(Collectors.toList());
	}
	
	public FosterDTO getFosterById(Long id)
	{
		Foster foster= fosterRepository.findById(id).orElseThrow(()->new RuntimeException("Foster Not found"));
		return modelMapper.map(foster, FosterDTO.class);
	}
	
	public FosterDTO addFoster(FosterDTO fosterDTO)
	{
		Foster foster = modelMapper.map(fosterDTO, Foster.class);
		return modelMapper.map(fosterRepository.save(foster), FosterDTO.class);
	}
	
	public FosterDTO updateFoster(Long id, FosterDTO fosterDTO)
	{
		Foster foster = fosterRepository.findById(id).orElseThrow(()->new RuntimeException("Foster not found"));
		foster.setName(fosterDTO.getName());
		foster.setContactDetails(fosterDTO.getContactDetails());
		foster = fosterRepository.save(foster);
		
		return modelMapper.map(foster, FosterDTO.class);
	}
	
	public void deleteFoster(Long id)
	{
		fosterRepository.deleteById(id);
	}
}

