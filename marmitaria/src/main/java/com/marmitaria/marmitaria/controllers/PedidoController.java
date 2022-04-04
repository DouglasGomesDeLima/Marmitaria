package com.marmitaria.marmitaria.controllers;

import java.util.List;
import java.util.UUID;

import com.marmitaria.marmitaria.models.Pedido;
import com.marmitaria.marmitaria.services.PedidoService;

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
@RequestMapping("/pedido")

public class PedidoController {

    final PedidoService PedidoService;

    public PedidoController(PedidoService pedidoService){
        this.PedidoService= pedidoService;
    }
    
    @GetMapping("/{id}")
    public Pedido getUser(@PathVariable(value = "id") UUID id){
        Pedido produtos = new Pedido();
        produtos.setId_pedido(id);
        return this.PedidoService.getById(null);

    }

    @GetMapping()
    public List<Pedido> getUsers(){
        return this.PedidoService.getAll();
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