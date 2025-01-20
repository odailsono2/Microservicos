package com.example.banco.service.RestTemplateService;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ExternalService {
    private final RestTemplate restTemplate;

    @Autowired
    public ExternalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String retrieveDataFromExternalService(String url) {
        // String url = "http://external-service/api/data";
        System.out.println("****url: "+url);
        return restTemplate.getForObject(url,String.class);
        
    }
}
