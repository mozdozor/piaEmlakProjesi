package com.emlakProject.Emlak.model;

import ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@AllArgsConstructor
public class Advertisement {
    @Id
    private String id;
    private String title;
    private String advContent;
    private String city;
    private String state;
    private int size;
    private String  room;
    private String floor;
    private String heatingType;
    private String advType; //İlan tipi
    private double price;
    private boolean isFurniture;
    private List<String> photos;

}
