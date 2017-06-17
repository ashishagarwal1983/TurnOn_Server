package com.turnon.core.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.turnon.core.couchbaserepo.UserRepository;
import com.turnon.core.model.UserProfile;
import com.turnon.core.services.UserService;


@Service
public class UserRepositoryService implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	

//	@Autowired
//    public UserServiceImpl(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
	
	//@Override
	public void registerUser(UserProfile userProfile) {
		userRepository.save(userProfile);
	}

	/*@Override
	public UserProfile getUserByMobile(String mobile) {
		return null;
	}
*/
}
