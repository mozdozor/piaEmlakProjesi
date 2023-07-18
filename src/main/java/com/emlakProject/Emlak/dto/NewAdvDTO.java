package com.emlakProject.Emlak.dto;

import com.emlakProject.Emlak.model.Advertisement;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class NewAdvDTO {
    private String name;
    private String lastname;
    private String email;
    private String phoneNumber;
    private List<Advertisement> advertisements;

}
