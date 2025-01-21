package com.example.bancolog.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bancolog.RecursosPersnalizados.Exceptions.BancoException;
import com.example.bancolog.model.Operacao;
import com.example.bancolog.service.LogOperacoes.LogOperacoes;

@RestController
@RequestMapping("/bancoLog")
public class ControllerLogOperacoes {

    private LogOperacoes operacao;

    public ControllerLogOperacoes(LogOperacoes operacao) {
        this.operacao = operacao;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Olá, Bem vindo ao Log do Banco do Brezel!";
    }

    
    @PostMapping("/criarLog/{op}")
    public String salvar(@PathVariable(value = "op", required = true) String op) throws Exception{
        return operacao.salvarOperacao(op);
        
               
    }

 
    @GetMapping("/admin/listarcontas")
    public List<Operacao> findAll() throws BancoException{

        return operacao.findAll();
    }

}
