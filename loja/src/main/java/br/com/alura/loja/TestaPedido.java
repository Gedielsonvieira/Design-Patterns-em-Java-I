package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;

import java.math.BigDecimal;

public class TestaPedido {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        geraPedido.executa();
    }

}
