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
@Table(name = "CondPagamento")
public class CondPagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_condPagamento;

    @Column(nullable = false, unique = true, length = 20)
    private String descricao;

    @Column(nullable = false, unique = true, length = 15)
    private String listaFormas;

    /**
     * @return UUID return the id_condPagamento
     */
    public UUID getId_condPagamento() {
        return id_condPagamento;
    }

    /**
     * @param id_condPagamento the id_condPagamento to set
     */
    public void setId_condPagamento(UUID id_condPagamento) {
        this.id_condPagamento = id_condPagamento;
    }

    /**
     * @return String return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return String return the listaFormas
     */
    public String getListaFormas() {
        return listaFormas;
    }

    /**
     * @param listaFormas the listaFormas to set
     */
    public void setListaFormas(String listaFormas) {
        this.listaFormas = listaFormas;
    }

}
