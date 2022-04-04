package com.marmitaria.marmitaria.controllers;

import java.util.List;
import java.util.UUID;

import com.marmitaria.marmitaria.models.Conta;
import com.marmitaria.marmitaria.services.ContaService;

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
@RequestMapping("conta")

public class ContaController {

    final ContaService ContaService;

    public ContaController(ContaService contaService){
        this.ContaService = contaService;
    }
    
    @GetMapping("/{id}")
    public Conta getUser(@PathVariable(value = "id") UUID id){
        Conta conta= new Conta();
       Conta.setId_conta(id);
        return this.ContaService.getById(null);

    }

    @GetMapping()
    public List<Conta> getUsers(){
        return this.ContaService.getAll();
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