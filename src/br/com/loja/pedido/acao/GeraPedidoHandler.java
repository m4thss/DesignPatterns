package br.com.loja.pedido.acao;

import br.com.loja.orcamento.Orcamento;
import br.com.loja.pedido.GeraPedido;
import br.com.loja.pedido.Pedido;

import java.awt.image.BandCombineOp;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executar(pedido));


    }
}
