package com.emlakProject.Emlak.dto;

import com.emlakProject.Emlak.model.Advertisement;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.PrimitiveIterator;

@Getter
@Setter
public class AdvDetailDTO {


    private String name;
    private String lastName;
    private String phoneNumber;
    private String email;

    private String advertisementType; //İlan tipi Satılık-Kiralık
    private String estateType; // daire-iş yeri
    private String title;
    private String advContent;
    private String firstImagePath;
    private String secondImagePath;
    private String thirdImagePath;
    private double price;
    private int size;
    private String city;
    private String state;
    private String floor;
    private String  room;
    private String heatingType;
    private Boolean isFurniture;

    //    private List<String> photos;
    private LocalDateTime createdDate;



}
