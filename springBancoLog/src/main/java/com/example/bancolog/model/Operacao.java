package com.example.bancolog.model;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_log")
public class Operacao implements Serializable{
    
    @Id
    private Integer id;

    private String operacao;

    public Operacao(){}

    public Operacao(Integer id, String operacao) {
        this.id = id;
        this.operacao = operacao;
    }

    public Integer getId() {
        return id;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

}