package com.marmitaria.marmitaria.services;

import com.marmitaria.marmitaria.repository.FormulaPagamentoRepository;

import org.springframework.stereotype.Service;

@Service

public class FormulaPagamentoService {

    final FormulaPagamentoRepository formulaPagamentoRepository;

    public FormulaPagamentoService(FormulaPagamentoRepository formulaPagamentoRepository) {
        this.formulaPagamentoRepository = formulaPagamentoRepository;
    }
    
}
