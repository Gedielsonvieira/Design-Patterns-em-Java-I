package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {

    private String clinte;
    private LocalDateTime data;
    private Orcamento orcamento;

    public Pedido(String clinte, LocalDateTime data, Orcamento orcamento) {
        this.clinte = clinte;
        this.data = data;
        this.orcamento = orcamento;
    }

    public String getClinte() {
        return clinte;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }

}
