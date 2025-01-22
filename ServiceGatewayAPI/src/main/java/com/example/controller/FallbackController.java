package com.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/fallback")
    public ResponseEntity<String> fallbackMethod() {
        return ResponseEntity.ok("Serviço temporariamente indisponível. Por favor, tente novamente mais tarde.");
    }
}