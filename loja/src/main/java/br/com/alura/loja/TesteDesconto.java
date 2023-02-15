package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDescontos;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {

    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("100"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("700"), 1);

        CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();

        BigDecimal calculoDescontoItens = calculadoraDescontos.calcularDesconto(orcamento1);
        System.out.println(calculoDescontoItens);

        BigDecimal calculoDescontoValor = calculadoraDescontos.calcularDesconto(orcamento2);
        System.out.println(calculoDescontoValor);
    }
}
