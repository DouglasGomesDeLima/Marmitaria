package com.marmitaria.marmitaria.services;

import java.util.List;

import com.marmitaria.marmitaria.models.Cliente;
import com.marmitaria.marmitaria.repository.ClienteRepository;

import org.springframework.stereotype.Service;

@Service
public class ClienteService {
   
    final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente getById(Object object) {
        return null;
    }

    public List<Cliente> getAll() {
        return null;
    }

}
