package com.marmitaria.marmitaria.models;

import java.io.Serializable;
import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Conta")
public class Conta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_conta;

    @Column(nullable = false, unique = true)
    private String descricao;

    @Column(nullable = false, unique = true)
    private Date dataVcto;

    @Column(nullable = false, unique = true)
    private String tipo;

    @Column(nullable = false, unique = true)
    private String valor;

    @Column(nullable = false, unique = true)
    private Date data;

    @Column(nullable = false, unique = true)
    private String status;

    
    @ManyToOne
    @JoinColumn(name="id_formaPagamento")
    private FormulaPagamento formulaPagamento;



    

    /**
     * @return UUID return the id_conta
     */
    public UUID getId_conta() {
        return id_conta;
    }

    /**
     * @param id_conta the id_conta to set
     */
    public static void setId_conta(UUID id_conta) {
        this.id_conta = id_conta;
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
     * @return Date return the dataVcto
     */
    public Date getDataVcto() {
        return dataVcto;
    }

    /**
     * @param dataVcto the dataVcto to set
     */
    public void setDataVcto(Date dataVcto) {
        this.dataVcto = dataVcto;
    }

    /**
     * @return String return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return String return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;
    }

    /**
     * @return Date return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
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

}
