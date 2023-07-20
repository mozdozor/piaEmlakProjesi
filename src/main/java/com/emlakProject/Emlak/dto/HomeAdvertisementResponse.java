package com.emlakProject.Emlak.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HomeAdvertisementResponse {

    private String id;
    private String photo;
    private String city;
    private String title;
    private double price;
}
