package com.emlakProject.Emlak.model;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document
@Data
public class Advertisement {

    @Id
    private String id;

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
    private String user_id;





}
