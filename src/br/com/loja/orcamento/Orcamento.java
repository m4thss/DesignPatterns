package br.com.loja.orcamento;

import br.com.loja.orcamento.situacao.Aprovado;
import br.com.loja.orcamento.situacao.EmAnalise;
import br.com.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {
    private BigDecimal valor;
    private int quantidadeItens;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public SituacaoOrcamento getSituacao(){
        return situacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void aplicarDescontoAdicional(){
        BigDecimal valorDesconto = this.situacao.calcularDesconto(this);
        this.valor = this.valor.subtract(valorDesconto);
    }

    public void aprovar(){
        this.situacao.aprovar(this);
    }

    public void reprovar(){
        this.situacao.reprovar(this);
    }
}
