package com.marmitaria.marmitaria.controllers;

import java.util.List;
import java.util.UUID;

import com.marmitaria.marmitaria.models.Produtos;
import com.marmitaria.marmitaria.services.ProdutosService;

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
@RequestMapping("/produtos")

public class ProdutosController {

    final ProdutosService ProdutosService;

    public ProdutosController(ProdutosService produtosService){
        this.ProdutosService= produtosService;
    }
    
    @GetMapping("/{id}")
    public Produtos getUser(@PathVariable(value = "id") UUID id){
        Produtos produtos = new Produtos();
        produtos.setId_produto(id);
        return this.ProdutosService.getById(null);

    }

    @GetMapping()
    public List<Produtos> getUsers(){
        return this.ProdutosService.getAll();
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