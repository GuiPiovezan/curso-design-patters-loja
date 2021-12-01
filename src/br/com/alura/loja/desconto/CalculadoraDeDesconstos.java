package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeDesconstos {
    public BigDecimal calcular(Orcamento orcamento){
        

        //Chain of responsability - cadeia de responsabilidades
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
            new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                new SemDesconto()
            )
        );

        return desconto.calcular(orcamento);
    }
}
