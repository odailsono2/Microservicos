package com.example.banco.Configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("bancolog")
public class ConfigurationsBanco {

    
    private String nome;
    private String metodo;

    public String getMetodo() {
        return metodo;
    }

    public String getNome() {
        return nome;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
