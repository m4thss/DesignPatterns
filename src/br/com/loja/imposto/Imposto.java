package br.com.loja.imposto;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {
    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract  BigDecimal efetuarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento){
        BigDecimal valorImposto = efetuarCalculo(orcamento);
        BigDecimal valorOutro = BigDecimal.ZERO;

        if(outro != null){
            valorOutro = outro.efetuarCalculo(orcamento);
        }

        return valorImposto.add(valorOutro);
    }
}
