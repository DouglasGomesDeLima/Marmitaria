package com.marmitaria.marmitaria.services;

import java.util.List;

import com.marmitaria.marmitaria.models.Conta;
import com.marmitaria.marmitaria.repository.ContaRepositoy;

import org.springframework.stereotype.Service;

@Service

public class ContaService {
    
    final ContaRepositoy contaRepositoy;

    public ContaService(ContaRepositoy contaRepositoy) {
        this.contaRepositoy = contaRepositoy;
    }

    public Conta getById(Object object) {
        return null;
    }

    public List<Conta> getAll() {
        return null;
    }


}
