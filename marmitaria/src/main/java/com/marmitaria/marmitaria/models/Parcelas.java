package com.marmitaria.marmitaria.models;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "Parcelas")
public class Parcelas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_parcelas;

    @Column(nullable = false, unique = true, length = 30)
    private String multas;

    @Column(nullable = false, unique = true, length = 8)
    private Date dias;

    @Column(nullable = false, unique = true, length = 2)
    private String nroParcelas;

    @Column(nullable = false, unique = true, length = 20)
    private String atdParcelas;

    @Column(nullable = false, unique = true, length = 2)
    private String juros;

    @ManyToOne
    @JoinColumn(name="id_CondPagamento")
    private CondPagamento condPagamento;

    /**
     * @return UUID return the id_parcelas
     */
    public UUID getId_parcelas() {
        return id_parcelas;
    }

    /**
     * @param id_parcelas the id_parcelas to set
     */
    public void setId_parcelas(UUID id_parcelas) {
        this.id_parcelas = id_parcelas;
    }

    /**
     * @return String return the multas
     */
    public String getMultas() {
        return multas;
    }

    /**
     * @param multas the multas to set
     */
    public void setMultas(String multas) {
        this.multas = multas;
    }

    /**
     * @return Date return the dias
     */
    public Date getDias() {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(Date dias) {
        this.dias = dias;
    }

    /**
     * @return String return the nroParcelas
     */
    public String getNroParcelas() {
        return nroParcelas;
    }

    /**
     * @param nroParcelas the nroParcelas to set
     */
    public void setNroParcelas(String nroParcelas) {
        this.nroParcelas = nroParcelas;
    }

    /**
     * @return String return the atdParcelas
     */
    public String getAtdParcelas() {
        return atdParcelas;
    }

    /**
     * @param atdParcelas the atdParcelas to set
     */
    public void setAtdParcelas(String atdParcelas) {
        this.atdParcelas = atdParcelas;
    }

    /**
     * @return String return the juros
     */
    public String getJuros() {
        return juros;
    }

    /**
     * @param juros the juros to set
     */
    public void setJuros(String juros) {
        this.juros = juros;
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
