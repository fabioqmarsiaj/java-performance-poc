package com.fabioqmarsiaj.javaperformancepoc.processors;

import org.apache.commons.math3.util.ArithmeticUtils;
import org.springframework.stereotype.Component;

@Component
public class FactorialProcessor {

    public long process(int value) throws InterruptedException {
        Thread.sleep(400);

        return ArithmeticUtils.factorial(value);
    }
}
