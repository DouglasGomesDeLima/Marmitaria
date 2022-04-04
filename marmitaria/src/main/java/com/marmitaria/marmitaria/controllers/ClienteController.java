package com.marmitaria.marmitaria.controllers;

import java.util.List;
import java.util.UUID;

import com.marmitaria.marmitaria.models.Cliente;
import com.marmitaria.marmitaria.services.ClienteService;

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
@RequestMapping("/cliente")

public class ClienteController {

    final ClienteService ClienteService;

    public ClienteController(ClienteService clienteService){
        this.ClienteService= clienteService;
    }
    
    @GetMapping("/{id}")
    public Cliente getUser(@PathVariable(value = "id") UUID id){
        Cliente cliente = new Cliente();
        cliente.setId_cliente(id);
        return this.ClienteService.getById(null);

    }

    @GetMapping()
    public List<Cliente> getUsers(){
        return this.ClienteService.getAll();
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