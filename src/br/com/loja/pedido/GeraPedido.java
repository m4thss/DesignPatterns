package br.com.loja.pedido;

import br.com.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public String getCliente(){
        return this.cliente;
    }

    public void executa(){
        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.quantidadeItens);
        Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);

        System.out.println("Gerando pedido...");
    }
}
