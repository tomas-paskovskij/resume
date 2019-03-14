package com.instinktaz.resume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.instinktaz.resume.entity.Profile;
import com.instinktaz.resume.repository.storage.ProfileRepository;
import com.instinktaz.resume.service.FindProfileService;

@Service
public class FindProfileServiceImpl implements FindProfileService {

	@Autowired
	private ProfileRepository profileRepository;
	
	@Override
	public Profile findByUid(String uid) {
		return profileRepository.findByUid(uid);
	}
}