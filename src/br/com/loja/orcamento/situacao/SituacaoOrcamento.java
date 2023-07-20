package br.com.loja.orcamento.situacao;

import br.com.loja.DomainException;
import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularDesconto(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orcamento não pode ser finalizado");
    }
}