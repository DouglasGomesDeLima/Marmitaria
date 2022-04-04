package com.marmitaria.marmitaria.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_cliente;

    @Column(nullable = false, unique = true, length = 25)
    private String nome;

    @Column(nullable = false, unique = true, length = 25)
    private String endereco;

    @Column(nullable = false, unique = true, length = 13)
    private String numero;

    @Column(nullable = false, unique = true, length = 25)
    private String pontoReferencia;

    /**
     * @return UUID return the id_cliente
     */
    public UUID getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(UUID id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return String return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return String return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @return String return the pontoReferencia
     */
    public String getPontoReferencia() {
        return pontoReferencia;
    }

    /**
     * @param pontoReferencia the pontoReferencia to set
     */
    public void setPontoReferencia(String pontoReferencia) {
        this.pontoReferencia = pontoReferencia;
    }

}