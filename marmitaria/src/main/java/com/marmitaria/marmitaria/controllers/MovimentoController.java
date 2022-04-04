package com.marmitaria.marmitaria.controllers;

import java.util.List;
import java.util.UUID;

import com.marmitaria.marmitaria.models.Movimento;
import com.marmitaria.marmitaria.services.MovimentoService;

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
@RequestMapping("/movimento")

public class MovimentoController {

    final MovimentoService MovimentoService;

    public MovimentoController(MovimentoService movimentoService){
        this.MovimentoService= movimentoService;
    }
    
    @GetMapping("/{id}")
    public Movimento getUser(@PathVariable(value = "id") UUID id){
        Movimento produtos = new Movimento();
        produtos.setId_Movimento(id);
        return this.MovimentoService.getById(null);

    }

    @GetMapping()
    public List<Movimento> getUsers(){
        return this.MovimentoService.getAll();
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