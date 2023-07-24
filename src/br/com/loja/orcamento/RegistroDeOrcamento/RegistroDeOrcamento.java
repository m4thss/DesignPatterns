package br.com.loja.orcamento.RegistroDeOrcamento;

import br.com.loja.DomainException;
import br.com.loja.http.HttpAdapter;
import br.com.loja.orcamento.Orcamento;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        if (orcamento.isFinalizado()){
            throw new DomainException("Orçamento não finalizado");
        }

        String url = "http://api.externa/orçamento"; //URL fictícia
        Map<String, Object> dados= Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );

        http.post(url, dados);
    }
}
