package br.com.alura.loja.pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acoes.AcoesGerarPedido;

public class GeraPedidoHandler {

    private List<AcoesGerarPedido> acoes;

    public GeraPedidoHandler(List<AcoesGerarPedido> acoes) {
        this.acoes = acoes;
    }


    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        this.acoes.forEach(acao -> acao.executarAcao(pedido));
    }
}
