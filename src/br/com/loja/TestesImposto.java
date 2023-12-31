package br.com.loja;

import br.com.loja.imposto.CalculadorDeImposto;
import br.com.loja.imposto.ICMS;
import br.com.loja.imposto.ISS;
import br.com.loja.orcamento.ItemOrcamento;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("275")));

        CalculadorDeImposto calculadora = new CalculadorDeImposto();

        System.out.println(calculadora.calcularImposto(orcamento, new ISS(new ICMS(null))));
    }
}
