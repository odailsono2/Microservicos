package com.example.banco.FeignInterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name = "bancoLog-service")
public interface LogClient {
    @PostMapping("/bancoLog/criarLog/{log}")
    String sendLog(@PathVariable("log") String log);
    
}
