package com.emlakProject.Emlak.dto;

import com.emlakProject.Emlak.model.Advertisement;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SearchResultDTO {

    private String advType;
    private String advTitle;
    private String city;
    private String state;
    private String room;
    private String price;

}
