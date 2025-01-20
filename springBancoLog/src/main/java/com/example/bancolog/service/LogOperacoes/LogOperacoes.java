package com.example.bancolog.service.LogOperacoes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.bancolog.model.Operacao;

import com.example.bancolog.repository.OperacaoRepository;

@Service
public class LogOperacoes {

    @Autowired
    private OperacaoRepository operacaoRepository;

    @Value("${bancoLog.maximoLog:3}")
    private Integer maximoLog;

    private Integer id = 0;

    public LogOperacoes(){

    }

    public String getOperacao(String contaId) throws Exception {
        Operacao operacao = operacaoRepository.findById(contaId)
                .orElseThrow(() -> new Exception("Operacao Inexistente"));

        return operacao.getOperacao();
    }

    public String salvarOperacao(String opString) throws Exception {
        // Operacao operacao = operacaoRepository.findById(id)
        //         .orElseThrow(() -> new Exception("Operacao Inexistente"));

                
        Operacao operacao = new Operacao(nextId(),opString);
        operacao.setOperacao(opString);;
        operacaoRepository.save(operacao);

        return "Log realizado com sucesso";
    }

    public List<Operacao> findAll(){
        return operacaoRepository.findAll();
    }    

    private Integer nextId(){
        id = id > maximoLog ? 0 : id + 1;
        System.out.println("maximoLog " + maximoLog);
        System.out.println("id " + id);

        return id;
    }
}
