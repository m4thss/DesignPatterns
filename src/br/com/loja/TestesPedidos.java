package br.com.loja;

import br.com.loja.orcamento.Orcamento;
import br.com.loja.pedido.GeraPedido;
import br.com.loja.pedido.Pedido;
import br.com.loja.pedido.acao.BancoDeDados;
import br.com.loja.pedido.acao.EnviarEmail;
import br.com.loja.pedido.acao.GeraPedidoHandler;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = "Joao";
        BigDecimal valorOrcamento = new BigDecimal("500");
        int quantidadeItens = 8;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        GeraPedidoHandler handler =  new GeraPedidoHandler(Arrays.asList(new BancoDeDados(), new EnviarEmail()));
        handler.executa(gerador);
    }
}
