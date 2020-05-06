package com.fabioqmarsiaj.javaperformancepoc.controllers;

import com.fabioqmarsiaj.javaperformancepoc.services.FactorialAndArrayService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FactorialAndArrayController {

    @Autowired
    private FactorialAndArrayService factorialAndArrayService;

    @PostMapping("/{value}/{array}")
    @ResponseBody
    public ResponseEntity<String> processNumberFactorialAndArrayAsString(@PathVariable int value, @PathVariable ArrayList<String> array) throws InterruptedException {
        return ResponseEntity.ok(factorialAndArrayService.process(value, array));
    }
}
