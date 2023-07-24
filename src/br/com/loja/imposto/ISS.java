package br.com.loja.imposto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto{
    public ISS(Imposto outro) {
        super(outro);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
