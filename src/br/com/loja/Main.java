package br.com.loja;

import br.com.loja.descontos.CalculadoraDeDescontos;
import br.com.loja.imposto.CalculadorDeImposto;
import br.com.loja.imposto.ICMS;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("750"), 2);
        CalculadorDeImposto calculadora = new CalculadorDeImposto();
        System.out.println(calculadora.calcularImposto(orcamento, new ICMS()));

        CalculadoraDeDescontos descontos = new CalculadoraDeDescontos();
        System.out.println(descontos.calcular(orcamento));
    }
}
