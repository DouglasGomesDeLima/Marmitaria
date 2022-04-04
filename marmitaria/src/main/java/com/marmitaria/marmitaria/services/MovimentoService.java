package com.marmitaria.marmitaria.services;

import java.util.List;

import com.marmitaria.marmitaria.models.Movimento;
import com.marmitaria.marmitaria.repository.MovimentoRepository;

import org.springframework.stereotype.Service;

@Service

public class MovimentoService {

    final MovimentoRepository movimentoRepository;

    public MovimentoService(MovimentoRepository movimentoRepository) {
        this.movimentoRepository = movimentoRepository;
    }

    public Movimento getById(Object object) {
        return null;
    }

    public List<Movimento> getAll() {
        return null;
    }
    
}
