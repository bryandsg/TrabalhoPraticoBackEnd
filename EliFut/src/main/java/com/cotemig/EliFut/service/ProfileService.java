package com.cotemig.EliFut.service;

import java.util.List;
import java.util.Optional;

import com.cotemig.EliFut.model.Profile;

public interface ProfileService {
	
	public String getPassword();
	public List<Profile> getProfiles();
	public Optional<Profile> getProfilebyID(Integer idParameter);

}
