package br.com.loja;

import br.com.loja.orcamento.ItemOrcamento;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteComposicao {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarItem(new ItemOrcamento(new BigDecimal("150")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem(new ItemOrcamento(new BigDecimal("600")));
        novo.adicionarItem(antigo);

        System.out.println(novo.getValor());
    }
}
