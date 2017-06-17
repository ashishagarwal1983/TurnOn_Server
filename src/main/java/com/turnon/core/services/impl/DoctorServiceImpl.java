package com.turnon.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turnon.core.couchbaserepo.DoctorRepository;
import com.turnon.core.model.DoctorProfile;
import com.turnon.core.services.DoctorService;

@Service
public class DoctorServiceImpl implements DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;

	public void registerDoctor(DoctorProfile doctorProfile) {
		doctorRepository.save(doctorProfile);
	}
	
	/*@Override
	public void registerDoctor(DoctorProfile doctorProfile) {
		doctorRepository.save(doctorProfile);
	}
*/
	/*@Override
	public DoctorProfile getDoctorByMobile(String mobile) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}
