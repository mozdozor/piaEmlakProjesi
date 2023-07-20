package com.emlakProject.Emlak.controller;
import com.emlakProject.Emlak.dto.UserLoginRequest;
import com.emlakProject.Emlak.dto.UserLoginResponse;
import com.emlakProject.Emlak.dto.UserResponse;
import com.emlakProject.Emlak.dto.UserSaveRequest;
import com.emlakProject.Emlak.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/api")
@CrossOrigin
public class UserController {


    @Autowired
    private UserService userService;

    @PostMapping(value = "/saveUser")
    public UserResponse save(@RequestBody UserSaveRequest user) {

        return userService.save(user);
    }


    @PostMapping(value = "/loginUser")
    public UserLoginResponse loginUser(@RequestBody UserLoginRequest user) {

        return userService.isLoginSuccesss(user);

    }


}
