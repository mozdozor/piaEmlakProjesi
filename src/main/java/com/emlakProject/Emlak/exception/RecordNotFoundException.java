package com.emlakProject.Emlak.exception;



public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException() {
        super("Record not found!!");
    }
}