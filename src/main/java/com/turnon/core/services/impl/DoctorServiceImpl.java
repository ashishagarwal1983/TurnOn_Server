package com.turnon.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turnon.core.couchbaserepo.UserRepository;
import com.turnon.core.model.DoctorProfile;
import com.turnon.core.model.UserProfile;
import com.turnon.core.services.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void registerDoctor(UserProfile userProfile) {
		userRepository.save(userProfile);
	}

	@Override
	public DoctorProfile getDoctorByMobile(String mobile) {
		// TODO Auto-generated method stub
		return null;
	}

}
