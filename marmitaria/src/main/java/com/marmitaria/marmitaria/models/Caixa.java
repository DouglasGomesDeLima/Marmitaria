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
@Table(name = "Caixa")
public class Caixa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_caixa;

    @Column(nullable = false, unique = true, length = 30)
    private String status;

    @Column(nullable = false, unique = true, length = 30)
    private Date dataAbertura;

    @Column(nullable = false, unique = true, length = 30)
    private String saldo;

    @ManyToOne
    @JoinColumn(name = "id_movimento")
    private Movimento movimento;

    /**
     * @return UUID return the id_caixa
     */
    public UUID getId_caixa() {
        return id_caixa;
    }

    /**
     * @param id_caixa the id_caixa to set
     */
    public void setId_caixa(UUID id_caixa) {
        this.id_caixa = id_caixa;
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
     * @return Date return the dataAbertura
     */
    public Date getDataAbertura() {
        return dataAbertura;
    }

    /**
     * @param dataAbertura the dataAbertura to set
     */
    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    /**
     * @return String return the saldo
     */
    public String getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    /**
     * @return Movimento return the movimento
     */
    public Movimento getMovimento() {
        return movimento;
    }

    /**
     * @param movimento the movimento to set
     */
    public void setMovimento(Movimento movimento) {
        this.movimento = movimento;
    }

}
