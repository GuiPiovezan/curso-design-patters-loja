package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.http.HttpAdapter;
import br.com.alura.loja.http.HttpClient;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroOrcamento;

public class TestesAdpater {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 4);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroOrcamento registroOrcamento = new RegistroOrcamento(new HttpClient());
        registroOrcamento.registrarOrcamento(orcamento);
    }
}
