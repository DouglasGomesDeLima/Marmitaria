package com.marmitaria.marmitaria.services;

import java.util.List;

import com.marmitaria.marmitaria.models.Parcelas;
import com.marmitaria.marmitaria.repository.ParcelasRepository;

import org.springframework.stereotype.Service;

@Service

public class ParcelasService {

    final ParcelasRepository parcelasRepository;

    public ParcelasService(ParcelasRepository parcelasRepository) {
        this.parcelasRepository = parcelasRepository;
    }

    public List<Parcelas> getAll() {
        return null;
    }

    public Parcelas getById(Object object) {
        return null;
    }
    
}
