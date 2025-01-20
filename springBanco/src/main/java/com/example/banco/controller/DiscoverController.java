package com.example.banco.controller;

import java.util.List;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.banco.RecursosPersnalizados.Exceptions.BancoException;
import com.example.banco.service.banco.DiscoverService.ServiceDiscoveryController;

@RestController
public class DiscoverController {

    private ServiceDiscoveryController servicoLog;


    public DiscoverController(ServiceDiscoveryController servicoLog) {
        this.servicoLog = servicoLog;
    }

    @GetMapping("/servicos")
    public List<String> getServicoLog() throws BancoException{

        return servicoLog.getServices();
    }

    // @GetMapping("/service-instances")
    public List<ServiceInstance> getServiceInstances(String serviceName) {
        return servicoLog.getInstances(serviceName);
    }

}
