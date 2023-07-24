package br.com.loja;

import br.com.loja.http.JavaHttpAdapter;
import br.com.loja.orcamento.ItemOrcamento;
import br.com.loja.orcamento.Orcamento;
import br.com.loja.orcamento.RegistroDeOrcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("750")) );

        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpAdapter());

        registro.registrar(orcamento);
    }
}
