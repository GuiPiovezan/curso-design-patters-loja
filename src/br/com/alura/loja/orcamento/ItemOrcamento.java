package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class ItemOrcamento implements Orcavel{
    private BigDecimal valor;

    public ItemOrcamento(){
        this.valor = BigDecimal.ZERO;
    }

    public ItemOrcamento(BigDecimal valor){
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}