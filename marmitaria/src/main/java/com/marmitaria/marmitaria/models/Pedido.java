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
@Table(name = "Pedido")
public class Pedido implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id_pedido;

    @Column(nullable = false, unique = true, length = 25)
    private String atendente;

    @Column(nullable = false, unique = true, length = 25)
    private Date data;
    
    @ManyToOne
    @JoinColumn(name="id_formaPagamento")
    private FormulaPagamento formulaPagamento;

    
    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name="id_produto")
    private Produtos produto;

    

    /**
     * @return UUID return the id_pedido
     */
    public UUID getId_pedido() {
        return id_pedido;
    }

    /**
     * @param id_pedido the id_pedido to set
     */
    public void setId_pedido(UUID id_pedido) {
        this.id_pedido = id_pedido;
    }

    /**
     * @return String return the atendente
     */
    public String getAtendente() {
        return atendente;
    }

    /**
     * @param atendente the atendente to set
     */
    public void setAtendente(String atendente) {
        this.atendente = atendente;
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
     * @return Cliente return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return Produtos return the produto
     */
    public Produtos getProduto() {
        return produto;
    }

    /**
     * @param produto the produto to set
     */
    public void setProduto(Produtos produto) {
        this.produto = produto;
    }

}
