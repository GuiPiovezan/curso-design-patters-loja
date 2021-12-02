package br.com.alura.loja;

import java.lang.Integer;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acoes.EnviarEmail;
import br.com.alura.loja.pedido.acoes.SalvarBancoDados;

public class TestePedido {
    public static void main(String[] args) {
        String cliente = "Guilherme";
        BigDecimal valorOrcamento = new BigDecimal("100");
        int quantidadeItens = 1;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(
            Arrays.asList(
                new SalvarBancoDados(),
                new EnviarEmail()
            )
        );
        handler.execute(gerador);
    }
}
