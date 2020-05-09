package com.fabioqmarsiaj.javaperformancepoc.services;

import com.fabioqmarsiaj.javaperformancepoc.models.RequestModel;
import com.fabioqmarsiaj.javaperformancepoc.models.ResponseModel;
import com.fabioqmarsiaj.javaperformancepoc.processors.ArrayProcessor;
import com.fabioqmarsiaj.javaperformancepoc.processors.FactorialProcessor;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactorialAndArrayService {
	
	private static final Logger log = LoggerFactory.getLogger(FactorialAndArrayService.class);

	
    @Autowired
    private FactorialProcessor factorialProcessor;

    @Autowired
    private ArrayProcessor arrayProcessor;

    Random rand = new Random();
    
    public ResponseModel process(RequestModel requestModel) throws InterruptedException {
    	log.info("request recebido {}", requestModel );
        
    	long factorial = factorialProcessor.process(requestModel.getValue());
        log.info("resultado do fatorial {}", factorial );
        
        String arrayAsString = arrayProcessor.process(requestModel.getArrayAsString());
        log.info("resultado da string {}", arrayAsString );
        
        Integer tempoEspera = rand.nextInt(500) + 200;
        log.info("esperando para simular processamento {}", tempoEspera);
        Thread.sleep(tempoEspera.longValue());
        
        return new ResponseModel(factorial, arrayAsString);
    }
}

