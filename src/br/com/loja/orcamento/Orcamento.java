package br.com.loja.orcamento;

import br.com.loja.orcamento.situacao.Aprovado;
import br.com.loja.orcamento.situacao.EmAnalise;
import br.com.loja.orcamento.situacao.Finalizado;
import br.com.loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel{
    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.situacao = new EmAnalise();
        this.itens = new ArrayList<>();
    }

    public int getQuantidadeItens() {
        return itens.size();
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public SituacaoOrcamento getSituacao(){
        return situacao;
    }

    public BigDecimal getValor() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
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

    public void finalizar(){
        this.situacao.finalizar(this);
    }

    public boolean isFinalizado() {
        return situacao instanceof Finalizado;
    }

    public void adicionarItem(Orcavel item){
        this.valor = valor.add(item.getValor());
        this.itens.add(item);
    }
}
