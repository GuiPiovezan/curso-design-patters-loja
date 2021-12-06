package br.com.alura.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamentaria;

public class Orcamento implements Orcavel {
    private SituacaoOrcamentaria situacao;
    private BigDecimal valor;

    private List<Orcavel> item;


    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.item = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra(Orcamento orcamento){
        BigDecimal valorDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }

    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public int getQuantidadeItens() {
        return this.item.size();
    }

    public SituacaoOrcamentaria getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamentaria situacao) {
        this.situacao = situacao;
    }

    public boolean isFinalizado(){
        return situacao instanceof Finalizado;
    }

    public void adicionarItem(Orcavel item){
        this.valor = valor.add(item.getValor());
        this.item.add(item);
    }
}