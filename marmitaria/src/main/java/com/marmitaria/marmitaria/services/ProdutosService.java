package com.marmitaria.marmitaria.services;

import java.util.UUID;

import com.marmitaria.marmitaria.models.Produtos;
import com.marmitaria.marmitaria.repository.ProdutoRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class ProdutosService {

    final ProdutoRepository produtoRepository;

    public ProdutosService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;

    }

    public void save(Produtos produtos) {
        this.produtoRepository.save(produtos);
    }

    public void delete(UUID id) {
        Optional<Produtos> produtos = this.produtoRepository.findById(id);
        this.produtoRepository.delete(produtos.get());
    }

    public void update(UUID id){
        Optional<Produtos> produtos = this.produtoRepository.findById(id);
        this.produtoRepository.save(produtos.get());
     
    }

public List<Produtos> getAll(){
    return this.produtoRepository.findAll();
}

public Produtos getById(UUID id){
    return this.produtoRepository.findById(id).get();
}

}
