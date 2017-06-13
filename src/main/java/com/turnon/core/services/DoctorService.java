package com.turnon.core.services;

import com.turnon.core.model.DoctorProfile;
import com.turnon.core.model.UserProfile;

public interface DoctorService {
	void registerDoctor(UserProfile userProfile);
	DoctorProfile getDoctorByMobile(String mobile);
}
