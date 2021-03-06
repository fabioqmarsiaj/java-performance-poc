package com.fabioqmarsiaj.javaperformancepoc.controllers;

import com.fabioqmarsiaj.javaperformancepoc.models.RequestModel;
import com.fabioqmarsiaj.javaperformancepoc.models.ResponseModel;
import com.fabioqmarsiaj.javaperformancepoc.services.FactorialAndArrayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service")
public class FactorialAndArrayController {

    @Autowired
    private FactorialAndArrayService factorialAndArrayService;

    @PostMapping(value = "/process")
    @ResponseBody
    public ResponseEntity<ResponseModel> processNumberFactorialAndArrayAsString(@RequestBody RequestModel requestModel) throws InterruptedException {
        return ResponseEntity.ok(factorialAndArrayService.process(requestModel));
    }
}
