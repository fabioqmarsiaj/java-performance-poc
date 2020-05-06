package com.fabioqmarsiaj.javaperformancepoc.processors;

import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class ArrayProcessor {

    public String process(ArrayList<String> array) {

        StringBuilder stringBuilder = new StringBuilder();

        for (String string : array) {
            stringBuilder.append(string);
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }
}
