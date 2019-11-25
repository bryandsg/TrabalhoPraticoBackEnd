package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cotemig.EliFut.model.Profile;
import com.cotemig.EliFut.repository.ProfileRepository;

public class ProfileServiceImpl implements ProfileService {
	
	@Autowired
	ProfileRepository profile;

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profile> getProfiles() {
		// TODO Auto-generated method stub
		return profile.findAll();
	}

	@Override
	public Optional<Profile> getProfilebyID(Integer idParameter) {
		// TODO Auto-generated method stub
		return profile.findById(idParameter);
	}

}
