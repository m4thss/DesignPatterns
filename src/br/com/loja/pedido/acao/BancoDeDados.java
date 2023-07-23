package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;

public class BancoDeDados implements AcaoAposGerarPedido{
    
    public void executar(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados...");
    }
}
