package com.emlakProject.Emlak.dto;

import com.emlakProject.Emlak.model.Advertisement;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.PrimitiveIterator;

@Getter
@Setter
public class AdvDetailDTO {
    private String name;
    private String lastname;
    private String phoneNumber;
    private  String email;
    private List<Advertisement> advertisements;

}
