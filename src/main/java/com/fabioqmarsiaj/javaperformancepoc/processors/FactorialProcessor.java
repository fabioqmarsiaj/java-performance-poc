package com.fabioqmarsiaj.javaperformancepoc.processors;

import org.apache.commons.math3.util.ArithmeticUtils;
import org.springframework.stereotype.Component;

@Component
public class FactorialProcessor {

    public long process(String value){
        return ArithmeticUtils.factorial(Integer.parseInt(value));
    }
}
