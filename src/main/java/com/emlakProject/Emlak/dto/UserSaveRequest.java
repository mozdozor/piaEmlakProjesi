package com.emlakProject.Emlak.dto;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class UserSaveRequest {

    private String name;

    private String lastName;

    private String email;

    private String password;

    private String phone;

}
