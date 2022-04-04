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
@Table(name = "Movimento")

public class Movimento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_movimento;

    @Column(nullable = false, unique = true, length = 30)
    private String descricao;

    @Column(nullable = false, unique = true, length = 30)
    private Date data;

    @Column(nullable = false, unique = true, length = 30)
    private String tipo;

    @Column(nullable = false, unique = true, length = 30)
    private String status;

    @Column(nullable = false, unique = true, length = 30)
    private String valor;


    @ManyToOne
    @JoinColumn(name="id_conta")
    private Conta conta;


    public void setId_Movimento(UUID id) {
    }

}
