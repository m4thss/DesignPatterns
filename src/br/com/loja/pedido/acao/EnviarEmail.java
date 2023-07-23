package br.com.loja.pedido.acao;

import br.com.loja.pedido.Pedido;

public class EnviarEmail implements AcaoAposGerarPedido{
    
    public void executar(Pedido pedido){
        System.out.println("Enviando Email...");
    }
}
