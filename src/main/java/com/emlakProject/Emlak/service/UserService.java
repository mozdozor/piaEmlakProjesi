package com.emlakProject.Emlak.service;


import com.emlakProject.Emlak.dto.UserLoginRequest;
import com.emlakProject.Emlak.dto.UserLoginResponse;
import com.emlakProject.Emlak.dto.UserResponse;
import com.emlakProject.Emlak.dto.UserSaveRequest;
import com.emlakProject.Emlak.exception.DefaultExceptionMessage;
import com.emlakProject.Emlak.exception.SameObjectException;
import com.emlakProject.Emlak.model.User;
import com.emlakProject.Emlak.repository.UserRepository;
import com.emlakProject.Emlak.util.UserMapperUtil;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public UserLoginResponse isLoginSuccesss (UserLoginRequest userLoginRequest){
        User existingUser = userRepository.findByEmailAndPassword(userLoginRequest.getEmail(),userLoginRequest.getPassword());
        if(existingUser != null && existingUser.getEmail().equals(existingUser.getEmail()) && existingUser.getPassword().equals(existingUser.getPassword()) ){
            return UserMapperUtil.toUserLoginResponse(existingUser);
        }else{
            UserLoginResponse userLoginResponse = new UserLoginResponse();
            userLoginResponse.setLoginSuccess(false);
            return userLoginResponse;
        }

    }



    public UserResponse save(UserSaveRequest request)  {

        if(userRepository.findByEmail(request.getEmail()) == null ){
            User user = UserMapperUtil.toUser(request);
            User savedUser = userRepository.save(user);
            return UserMapperUtil.toUserResponse(savedUser);
        }else{
            throw new SameObjectException("Aynı mail adresine sahip bir kullanıcı bulunmaktadır.");
        }

    }




}
