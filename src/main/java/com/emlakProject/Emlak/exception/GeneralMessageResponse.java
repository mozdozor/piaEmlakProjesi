package com.emlakProject.Emlak.exception;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class GeneralMessageResponse {

    private Boolean isSuccess;
    private String Message;

}
