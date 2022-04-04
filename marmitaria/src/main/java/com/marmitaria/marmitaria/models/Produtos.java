package com.marmitaria.marmitaria.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produtos implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_produto;

    @Column(nullable = false, unique = true, length = 10)
    private String produto;

    /**
     * @return UUID return the id_produto
     */
    public UUID getId_produto() {
        return id_produto;
    }

    /**
     * @param id_produto the id_produto to set
     */
    public void setId_produto(UUID id_produto) {
        this.id_produto = id_produto;
    }

    /**
     * @return String return the produto
     */
    public String getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(String produto) {
        this.produto = produto;
    }

}
