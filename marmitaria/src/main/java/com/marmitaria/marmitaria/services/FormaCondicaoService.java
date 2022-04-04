package com.marmitaria.marmitaria.services;

import java.util.List;

import com.marmitaria.marmitaria.models.FormaCondicao;
import com.marmitaria.marmitaria.repository.FormaCondicaoRepository;

import org.springframework.stereotype.Service;

@Service

public class FormaCondicaoService {
    
    final FormaCondicaoRepository condicaoRepository;

    public FormaCondicaoService(FormaCondicaoRepository condicaoRepository) {
        this.condicaoRepository = condicaoRepository;
    }

    public FormaCondicao getById(Object object) {
        return null;
    }

    public List<FormaCondicao> getAll() {
        return null;
    }
}
