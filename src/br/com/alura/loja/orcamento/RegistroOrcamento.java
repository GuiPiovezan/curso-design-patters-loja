package br.com.alura.loja.orcamento;

import java.util.Map;

import javax.swing.plaf.metal.OceanTheme;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

public class RegistroOrcamento  {
    private HttpAdapter http;

    public RegistroOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrarOrcamento(Orcamento orcamento){
        if(!orcamento.isFinalizado()){
            throw new DomainException("Orçamento não finalizado");
        }

        String url = "http://externo/orcamento";
        Map<String, Object> dados = Map.of(
            "valor", orcamento.getValor(),
            "quantidade", orcamento.getQuantidadeItens()
        );

        this.http.post(url, dados);
    }
    
}
