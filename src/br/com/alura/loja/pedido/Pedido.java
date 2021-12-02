package br.com.alura.loja.pedido;

import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;

public class Pedido {
    private String cliente;
    private LocalDateTime date;
    private Orcamento orcamento;


    public Pedido(String cliente, LocalDateTime date, Orcamento orcamento) {
        this.cliente = cliente;
        this.date = date;
        this.orcamento = orcamento;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setOrcamento(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    
}
