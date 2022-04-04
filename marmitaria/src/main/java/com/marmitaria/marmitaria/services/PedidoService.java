package com.marmitaria.marmitaria.services;

import java.util.UUID;

import com.marmitaria.marmitaria.models.Pedido;
import com.marmitaria.marmitaria.repository.PedidoRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PedidoService {

    final PedidoRepository produtoRepository;
    private Object pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;

    }

    public void save(Pedido pedido) {
        this.pedidoRepository.save(pedido);
    }

    public void delete(UUID id) {
        Optional<Pedido> pedido = this.pedidoRepository.findById(id);
        this.pedidoRepository.delete(pedido.get());
    }

    public void update(UUID id){
        Optional<Pedido> produtos = this.pedidoRepository.findById(id);
        this.pedidoRepository.save(produtos.get());
     
    }

public List<Pedido> getAll(){
    return this.pedidoRepository.findAll();
}

public Pedido getById(UUID id){
    return this.pedidoRepository.findById(id).get();
}

}
