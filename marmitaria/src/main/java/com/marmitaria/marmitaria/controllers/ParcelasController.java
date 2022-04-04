package com.marmitaria.marmitaria.controllers;

import java.util.List;
import java.util.UUID;

import com.marmitaria.marmitaria.models.Parcelas;
import com.marmitaria.marmitaria.services.ParcelasService;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableJpaRepositories
@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parcelas")

public class ParcelasController {

    final ParcelasService ParcelasService;

    public ParcelasController(ParcelasService parcelasService){
        this.ParcelasService= parcelasService;
    }
    
    @GetMapping("/{id}")
    public Parcelas getUser(@PathVariable(value = "id") UUID id){
        Parcelas produtos = new Parcelas();
        produtos.setId_parcelas(id);
        return this.ParcelasService.getById(null);

    }

    @GetMapping()
    public List<Parcelas> getUsers(){
        return this.ParcelasService.getAll();
    }
    @PostMapping()
    public String createUser(){
        return "create";
    }
    @DeleteMapping("/{id}")
    public String deleteUser(){
        return "delete";
    }
    @PutMapping("/{id}")
    public String updateUser(){
        return "put";
}
}