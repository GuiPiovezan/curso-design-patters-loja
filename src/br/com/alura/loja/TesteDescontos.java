package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDesconstos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDescontos {
    public static void main(String[] args) {
        CalculadoraDeDesconstos calcular = new CalculadoraDeDesconstos();

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("600")));
        System.out.println(calcular.calcular(orcamento));

        Orcamento orcamento2 = new Orcamento();
        orcamento2.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        System.out.println(calcular.calcular(orcamento2));


        
    }
}
