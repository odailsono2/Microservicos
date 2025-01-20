package com.example.banco.service.banco.DiscoverService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceDiscoveryController {

    @Autowired
    private DiscoveryClient discoveryClient;

    public ServiceDiscoveryController(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    public List<String> getServices() {
        return discoveryClient.getServices();
    }

    public List<ServiceInstance> getInstances(String serviceName) {
        return discoveryClient.getInstances(serviceName);
    }
}
