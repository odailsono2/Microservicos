package com.example.bancolog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bancolog.model.Operacao;

public interface OperacaoRepository extends JpaRepository<Operacao, String> {
}