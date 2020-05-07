package com.fabioqmarsiaj.javaperformancepoc.processors;

import org.springframework.stereotype.Component;

@Component
public class ArrayProcessor {

    public String process(String[] array) {

        StringBuilder stringBuilder = new StringBuilder();

        for (String string : array) {
            stringBuilder.append(string);
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }
}
