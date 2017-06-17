package com.turnon.core.services;

import com.turnon.core.model.UserProfile;


public interface UserService {

    void registerUser(UserProfile userProfile);
    //UserProfile getUserByMobile(String mobile);
}
