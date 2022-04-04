package com.marmitaria.marmitaria.services;
import java.util.List;

import com.marmitaria.marmitaria.models.CondPagamento;
import com.marmitaria.marmitaria.repository.CondPagamentoRepository;

import org.springframework.stereotype.Service;

@Service

public class CondPagamentoService {

    final CondPagamentoRepository condPagamentoRepository;

    public CondPagamentoService(CondPagamentoRepository condPagamentoRepository) {
        this.condPagamentoRepository = condPagamentoRepository;
    }

    public CondPagamento getById(Object object) {
        return null;
    }

    public List<CondPagamento> getAll() {
        return null;
    }
    
}
