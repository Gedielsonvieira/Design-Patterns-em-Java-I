package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"),1);

        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();
        BigDecimal calculoIcms = calculadoraImpostos.calculaImpostoSobreOrcamento(orcamento, new ICMS());
        System.out.println(calculoIcms);

        BigDecimal calculoIss = calculadoraImpostos.calculaImpostoSobreOrcamento(orcamento, new ISS());
        System.out.println(calculoIss);
    }

}
