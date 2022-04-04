package com.marmitaria.marmitaria.repository;

import java.util.UUID;

import com.marmitaria.marmitaria.models.Parcelas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Repository
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parcelas")

public interface ParcelasRepository
extends JpaRepository<Parcelas, UUID>{

}
    