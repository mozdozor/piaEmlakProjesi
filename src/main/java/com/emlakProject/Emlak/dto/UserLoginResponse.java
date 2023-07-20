package com.emlakProject.Emlak.dto;


import com.emlakProject.Emlak.model.Advertisement;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserLoginResponse {

    private String user_id;
    private String name;
    private String lastname;
    private String phoneNumber;
    private String email;
    private List<Advertisement> advertisements;
    private boolean isLoginSuccess;
}
