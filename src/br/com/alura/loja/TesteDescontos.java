package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDesconstos;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDescontos {
    public static void main(String[] args) {
        CalculadoraDeDesconstos calcular = new CalculadoraDeDesconstos();


        Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);
        System.out.println(calcular.calcular(orcamento));

        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
        System.out.println(calcular.calcular(orcamento2));


        
    }
}
