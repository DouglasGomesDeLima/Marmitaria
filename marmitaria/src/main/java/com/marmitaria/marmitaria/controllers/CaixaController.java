package com.marmitaria.marmitaria.controllers;

import java.util.List;
import java.util.UUID;

import com.marmitaria.marmitaria.models.Caixa;
import com.marmitaria.marmitaria.services.CaixaService;

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
@RequestMapping("/caixa")

public class CaixaController {

    final CaixaService CaixaService;

    public CaixaController(CaixaService caixaService){
        this.CaixaService= caixaService;
    }
    
    @GetMapping("/{id}")
    public Caixa getUser(@PathVariable(value = "id") UUID id){
        Caixa caixa = new Caixa();
       caixa.setId_caixa(id);
        return this.CaixaService.getById(null);

    }

    @GetMapping()
    public List<Caixa> getUsers(){
        return this.CaixaService.getAll();
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