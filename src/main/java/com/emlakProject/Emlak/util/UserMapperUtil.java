package com.emlakProject.Emlak.util;


import com.emlakProject.Emlak.dto.UserLoginResponse;
import com.emlakProject.Emlak.dto.UserResponse;
import com.emlakProject.Emlak.dto.UserSaveRequest;
import com.emlakProject.Emlak.model.User;

import java.time.LocalDateTime;


public class UserMapperUtil {


    public static User toUser(UserSaveRequest userSaveRequest) {
        User user = new User();

        user.setName(userSaveRequest.getName());
        user.setLastname(userSaveRequest.getLastName());
        user.setEmail(userSaveRequest.getEmail());
        user.setPassword(userSaveRequest.getPassword());


        return user;
    }


    public static UserResponse toUserResponse(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setName(user.getName());
        userResponse.setLastName(user.getLastname());
        userResponse.setEmail(user.getEmail());

        return userResponse;
    }


    public static UserLoginResponse toUserLoginResponse(User user) {
        UserLoginResponse userLoginResponse = new UserLoginResponse();
        userLoginResponse.setName(user.getName());
        userLoginResponse.setLastname(user.getLastname());
        userLoginResponse.setEmail(user.getEmail());
        userLoginResponse.setPhoneNumber(user.getPhoneNumber());
        userLoginResponse.setUser_id(user.getId());
//        userLoginResponse.setAdvertisements(user.getAdvertisements());
        userLoginResponse.setLoginSuccess(true);

        return userLoginResponse;
    }
}
