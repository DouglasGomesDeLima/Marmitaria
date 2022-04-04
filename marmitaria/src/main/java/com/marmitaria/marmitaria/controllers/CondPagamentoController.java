package com.marmitaria.marmitaria.controllers;

import java.util.List;
import java.util.UUID;

import com.marmitaria.marmitaria.models.CondPagamento;
import com.marmitaria.marmitaria.services.CondPagamentoService;

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
@RequestMapping("/condPagamento")

public class CondPagamentoController {

    final CondPagamentoService CondPagamentoService;

    public CondPagamentoController(CondPagamentoService condPagamentoService){
        this.CondPagamentoService= condPagamentoService;
    }
    
    @GetMapping("/{id}")
    public CondPagamento getUser(@PathVariable(value = "id") UUID id){
        CondPagamento condPagamento = new CondPagamento();
        condPagamento.setId_condPagamento(id);
        return this.CondPagamentoService.getById(null);

    }

    @GetMapping()
    public List<CondPagamento> getUsers(){
        return this.CondPagamentoService.getAll();
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