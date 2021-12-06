package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

public class LogPedido implements AcoesGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Gerando log do pedido: " + pedido);
        
    }
    


}
