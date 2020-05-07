package com.fabioqmarsiaj.javaperformancepoc.models;

import java.util.Arrays;
import org.springframework.stereotype.Component;

@Component
public class RequestModel {

    private Integer value;
    private String[] arrayAsString;

    public RequestModel() {
    }

    public RequestModel(int value, String[] arrayAsString) {
        this.value = value;
        this.arrayAsString = arrayAsString;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String[] getArrayAsString() {
        return arrayAsString;
    }

    public void setArrayAsString(String[] arrayAsString) {
        this.arrayAsString = arrayAsString;
    }

    @Override
    public String toString() {
        return "RequestModel{" +
                "value=" + value +
                ", arrayAsString=" + Arrays.toString(arrayAsString) +
                '}';
    }
}
