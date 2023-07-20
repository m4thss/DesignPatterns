package br.com.loja.imposto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadorDeImposto {

    public BigDecimal calcularImposto(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
