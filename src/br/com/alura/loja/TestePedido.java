package br.com.alura.loja;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.Pedido;

public class TestePedido {
    public static void main(String[] args) {
        String cliente = args[0];
        int quantidadeItens = Integer.parseInt(args[2]);
        BigDecimal valorOrcamento = new BigDecimal(args[1]);

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler();
        handler.execute(gerador);
    }
}
