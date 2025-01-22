package com.example.banco.service.FeignService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banco.FeignInterface.LogClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class LogClientService {

    private LogClient logClient;

    @Autowired
    LogClientService(LogClient logClient){
        this.logClient = logClient;
    }

    @CircuitBreaker(name = "bancoLog-service")
    public String sendLog(String log){
        return logClient.sendLog(log);
    }
    
}
