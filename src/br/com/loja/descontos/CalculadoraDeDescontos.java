package br.com.loja.descontos;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoMaiorQueQuinhentos(
                new DescontoParaCincoOuMaisItens(
                        new SemDesconto()));

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
