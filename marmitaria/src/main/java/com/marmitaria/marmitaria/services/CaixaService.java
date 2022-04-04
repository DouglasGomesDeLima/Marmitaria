package com.marmitaria.marmitaria.services;



import java.util.List;

import com.marmitaria.marmitaria.models.Caixa;
import com.marmitaria.marmitaria.repository.CaixaRepository;

import org.springframework.stereotype.Service;

@Service
public class CaixaService {

    final CaixaRepository caixaRepository;

    public CaixaService(CaixaRepository caixaRepository) {
        this.caixaRepository = caixaRepository;
    }

    public Object save(Object caixaModel) {
        return null;
    }

    public Caixa getById(Object object) {
        return null;
    }

    public List<Caixa> getAll() {
        return null;
    }

    
    }


    

