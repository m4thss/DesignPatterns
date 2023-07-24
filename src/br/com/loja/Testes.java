package br.com.loja;

import br.com.loja.descontos.CalculadoraDeDescontos;
import br.com.loja.imposto.CalculadorDeImposto;
import br.com.loja.imposto.ICMS;
import br.com.loja.orcamento.ItemOrcamento;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Testes {
    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));

        CalculadorDeImposto calculadora = new CalculadorDeImposto();

        System.out.println(calculadora.calcularImposto(orcamento, new ICMS(null)));

        CalculadoraDeDescontos descontos = new CalculadoraDeDescontos();
        System.out.println(descontos.calcular(orcamento));
    }
}
