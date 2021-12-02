package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmail implements AcoesGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando e-mail com informações do pedido...");
    }
    
}
