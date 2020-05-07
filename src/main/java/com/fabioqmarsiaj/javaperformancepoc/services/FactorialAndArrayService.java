package com.fabioqmarsiaj.javaperformancepoc.services;

import com.fabioqmarsiaj.javaperformancepoc.models.RequestModel;
import com.fabioqmarsiaj.javaperformancepoc.models.ResponseModel;
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

    public ResponseModel process(RequestModel requestModel) {
        long factorial = factorialProcessor.process(requestModel.getValue());
        String arrayAsString = arrayProcessor.process(requestModel.getArrayAsString());

        return new ResponseModel(factorial, arrayAsString);
    }
}

