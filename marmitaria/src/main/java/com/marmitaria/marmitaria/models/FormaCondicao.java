package com.marmitaria.marmitaria.models;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "FormaCondicao")
public class FormaCondicao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_formaCondicao;


   
    @ManyToOne
    @JoinColumn(name="id_formaPagamento")
    private FormulaPagamento formulaPagamento;

    
    @ManyToOne
    @JoinColumn(name="id_CondPagamento")
    private CondPagamento condPagamento;


    /**
     * @return UUID return the id_formaCondicao
     */
    public UUID getId_formaCondicao() {
        return id_formaCondicao;
    }

    /**
     * @param id_formaCondicao the id_formaCondicao to set
     */
    public void setId_formaCondicao(UUID id_formaCondicao) {
        this.id_formaCondicao = id_formaCondicao;
    }

    /**
     * @return FormulaPagamento return the formulaPagamento
     */
    public FormulaPagamento getFormulaPagamento() {
        return formulaPagamento;
    }

    /**
     * @param formulaPagamento the formulaPagamento to set
     */
    public void setFormulaPagamento(FormulaPagamento formulaPagamento) {
        this.formulaPagamento = formulaPagamento;
    }

    /**
     * @return CondPagamento return the condPagamento
     */
    public CondPagamento getCondPagamento() {
        return condPagamento;
    }

    /**
     * @param condPagamento the condPagamento to set
     */
    public void setCondPagamento(CondPagamento condPagamento) {
        this.condPagamento = condPagamento;
    }

}
