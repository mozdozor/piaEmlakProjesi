package com.emlakProject.Emlak.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;




@Document
@Data
public class User {
    @Id
    private String id;
    private String name;
    private String lastname;
    private String password;
    private String phoneNumber;
    private String email;




}
