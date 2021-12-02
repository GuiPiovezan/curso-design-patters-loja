package br.com.alura.loja;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.Pedido;

public class TestePedido {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 4);

        String cliente = "Guilherme Piovezan";
        var data = LocalDateTime.now();

        Pedido pedido = new Pedido(cliente, data, orcamento);
    }
}
