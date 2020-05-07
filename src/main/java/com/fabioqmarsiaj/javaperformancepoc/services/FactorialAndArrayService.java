package com.fabioqmarsiaj.javaperformancepoc.services;

import com.fabioqmarsiaj.javaperformancepoc.processors.ArrayProcessor;
import com.fabioqmarsiaj.javaperformancepoc.processors.FactorialProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactorialAndArrayService {

    @Autowired
    private FactorialProcessor factorialProcessor;

    @Autowired
    private ArrayProcessor arrayProcessor;

    public String process(String value, String[] array) {
        long factorial = factorialProcessor.process(value);
        String arrayAsString = arrayProcessor.process(array);

        return factorial + " " + arrayAsString;
    }
}

