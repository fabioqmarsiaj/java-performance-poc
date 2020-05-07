package com.fabioqmarsiaj.javaperformancepoc.models;

import org.springframework.stereotype.Component;

@Component
public class ResponseModel {

    private Long value;
    private String arrayAsString;

    public ResponseModel() {
    }

    public ResponseModel(Long value, String arrayAsString) {
        this.value = value;
        this.arrayAsString = arrayAsString;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public String getArrayAsString() {
        return arrayAsString;
    }

    public void setArrayAsString(String arrayAsString) {
        this.arrayAsString = arrayAsString;
    }

}
